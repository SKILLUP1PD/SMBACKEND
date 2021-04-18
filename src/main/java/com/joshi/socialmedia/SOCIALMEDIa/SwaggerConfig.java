package com.joshi.socialmedia.SOCIALMEDIa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //Bean-Docket
    // Swagger


    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
        .select().paths(apidocumentation()).build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("social media documentation")
                .description("SErvice to hold api document")
                .contact(new Contact("JOSHi","","joshi1620@gmail.com")).build();
    }

    private Predicate<String> apidocumentation(){
        return (regex("/v1/.*"));
    }

}
