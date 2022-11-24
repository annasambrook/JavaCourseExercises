package com.anna.client;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.anna.persistence.BookDao;
import com.anna.persistence.BookDaoImpl;

@Configuration
@ComponentScan("com.anna.jdbc")
public class SpringJdbcConfig {
	
	@Bean(name="MySqlDataSource")
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/wileydi001");
        dataSource.setUsername("root");
        dataSource.setPassword("mypass");

        return dataSource;
    }
	
    @Bean
    public JdbcTemplate jdbcTemplate() {
      return new JdbcTemplate(mysqlDataSource());
    }
}
