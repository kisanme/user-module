package org.ucsc.ewa.userModule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("org.ucsc.ewa.userModule.service")
@PropertySource("classpath:spring/data-access.properties")
@EnableTransactionManagement
@Import({DataSourceConfig.class, JpaConfig.class})
public class BusinessConfig {


}
