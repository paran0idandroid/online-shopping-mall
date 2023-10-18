package com.likelong.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.likelong.mall.common.utils.PageUtils;
import com.likelong.mall.common.utils.Query;

import com.likelong.mall.product.dao.CategoryDao;
import com.likelong.mall.product.entity.CategoryEntity;
import com.likelong.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {

        //1 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //2 组装成父子的树形结构
        //找到所有一级分类
//        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity -> {
//            return categoryEntity.getParentCid() == 0;
//        })).collect(Collectors.toList());

        List<CategoryEntity> level1Menus = entities
                .stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                //peek一般用于修改数据，map一般用于转换数据类型
                .peek((menu) -> menu.setChildren(getChildrens(menu, entities)))
                .sorted((menu1, menu2)->{
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })

                .collect(Collectors.toList());

        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> list) {
        //TODO 检查当前删除的菜单是否被引用

        //逻辑删除
        baseMapper.deleteBatchIds(list);
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all){

        List<CategoryEntity> children = all
                .stream()
                .filter(categoryEntity -> {return categoryEntity.getParentCid() == root.getCatId();})
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, all));
                    return categoryEntity;})
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());

        return children;
    }

}