package com.tulip.code.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author: 杨帆
 * @Date: 2019/12/11 23:38
 * @Description:
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                //方法一，指定当前controller包路径
//                .apis(RequestHandlerSelectors.basePackage("com.tulip.code.controller"))
                //方法二，指定标签，如@RestController
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("接口文档")
                .description("这是后端自动生成的接口文档，可自动根据后端代码而改变，请记住/swagger-ui.html，日后可以直接访问，以此来查看和测试接口")
                .contact(new Contact("©郁金香", null, null)).version("1.0").build();
    }
}
