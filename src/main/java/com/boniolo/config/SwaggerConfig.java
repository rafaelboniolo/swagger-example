package com.boniolo.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.boniolo"))
            .build()
            .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){
        return new ApiInfo(
            "Nome do serviço",
            "Descrição do serviço",
            "Versão do serviço (1.0)",
            "Termos de serviço",
            new Contact(
                "name",
                "url",
                "email"
                ),
                "",
                "",
                new ArrayList<VendorExtension>()
        );
    }
}