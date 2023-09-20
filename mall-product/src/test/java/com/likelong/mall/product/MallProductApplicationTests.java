package com.likelong.mall.product;

import com.likelong.mall.product.entity.BrandEntity;
import com.likelong.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
//		BrandEntity b = new BrandEntity();
//		b.setName("apple");
//		brandService.save(b);
//		System.out.println(b.getName());
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(1L);
		brandEntity.setDescript("only apple can do");
		brandService.updateById(brandEntity);
		System.out.println("success");
	}

}
