package com.tulip.code.configs;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author: 杨帆
 * @Date: 2019/12/11 00:04
 * @Description:
 */
@Configuration
@MapperScan(basePackages = {"com.tulip.code.mapper.local"}, sqlSessionTemplateRef = "localSqlSessionTemplate")
public class LocalDataSourceConfig {
    @Bean
    @Primary
    public SqlSessionTemplate localSqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(localSqlSessionFactory());
    }

    @Bean
    @Primary
    public DataSourceTransactionManager localTransactionManager() {
        return new DataSourceTransactionManager(localDataSource());
    }

    @Bean
    @Primary
    public SqlSessionFactory localSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(localDataSource());
        factoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:com/tulip/code/mapper/xml/local/*.xml"));
        return factoryBean.getObject();
    }

    @Bean
    @Primary
    @ConfigurationProperties("datasource.local")
    public DataSourceProperties localDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("datasource.local.configuration")
    public DataSource localDataSource() {
        return localDataSourceProperties().initializeDataSourceBuilder()
                // 3. 可以显示指定连接池，也可以不显示指定；即此行代码可以注释掉
                .type(HikariDataSource.class)
                .build();
    }
}
