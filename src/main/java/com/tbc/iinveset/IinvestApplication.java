package com.tbc.iinveset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class IinvestApplication {

    public static void main(String[] args) {
        SpringApplication.run(IinvestApplication.class, args);
    }

    @Bean
    @Primary
    public DriverManagerDataSource getElcDatasource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setPassword("unityn");
        dataSource.setUrl("jdbc:mysql://localhost:3306/iinvest");
        dataSource.setUsername("root");
        return dataSource;
    }
}
