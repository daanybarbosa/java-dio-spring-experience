package br.com.dio.personApi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //Configuração do Swagger
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select() //selecionar as informações que vamos passar
                .apis(RequestHandlerSelectors.basePackage("br.com.dio.personApi.controller")) //vai fornecer uma base de api para o swagger
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo(){
        return new ApiInfoBuilder()
                .title("API Person")
                .description("REST API Person para gerenciamento de pessoas")
                .version("1.0.0") //versao para API
                .contact(new Contact(
                        "Daniele",
                        "github/daanybarbosa",
                        null)) //informações do contato
                .build();
    }
}
