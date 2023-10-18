# renren-fast加入网关踩坑
## renren-fast的springboot版本需要提高到2.6.6，原版本为2.3.4.RELEASE
<br> 但是这么做会导致renren-fast后台管理系统无法加载验证码
<br> 具体报错原因：When allowCredentials is true, allowedOrigins cannot contain the special value "*" since that cannot be set on the "Access-Control-Allow-Origin" response header. To allow credentials to a set of origins, list them explicitly or consider using "allowedOriginPatterns" instead.
<br> 当allowCredentials为true时，allowingOrigins不能包含特殊值"*"，因为无法在"Access-Control-Allow-Origin"响应标头上设置。要允许凭据具有一组来源，请明确列出它们或考虑改用"allowedOriginPatterns"
<br> 根本原因是2.6.6的Springboot对跨域有以上要求
<br> 解决：将allowingOrigins换成allowedOriginPatterns即可。
<br> 具体修改文件路径：renren-fast/src/main/java/io/renren/config/CorsConfig.java

## When allowCredentials is true, allowedOrigins cannot contain the special value "*" since that cannot be set on the "Access-Control-Allow-Origin" response header. 
## To allow credentials to a set of origins, list them explicitly or consider using "allowedOriginPatterns" instead.


### spring.cloud.nacos.config.server-addr 这是配置中心地址
### spring.cloud.nacos.discovery.server-addr 这是注册中心地址