package br.com.dio.Ex2_SpringBootConfig.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter //adicionando o lombok nas dependencias é possivel criar os Getter e Setter de maneira mais pratica
@Setter
public class DBConfiguration {

    // propriedades presentes no arquivo application-dev-exemplo.properties / application-prod.properties
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    //metodos - irao fazer o mapeamento das propriedades para dentro do sistema e vai subir o tipo de profile
    public String testDatabaseConnection(){
        System.out.println("DB connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Test instance";
    }

    @Profile("prod")
    @Bean
    public String testeDatabaseConnection(){
        System.out.println("DB connection for Production - MySQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to MYSQL_PROD - Production instance";
    }
}
