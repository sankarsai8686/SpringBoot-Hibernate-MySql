package com.book.SpringBoot_Hibernate_Mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class})
public class SpringBootHibernateMysqlApplication {

	public static void main(String[] args) {
		System.out.println("SpringBootApplication Started................");
		SpringApplication.run(SpringBootHibernateMysqlApplication.class, args);
	}
}
/*We have to exclude JpaRepositoriesAutoConfiguration.class and DataSourceAutoConfiguration.class 
 * because we are not using JPA here*/
 