package org.ucsc.ewa.userModule.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BusinessConfig.class, MethodSecurityConfig.class, OAuth2ResourceServerConfig.class})
public class RootApplicationContextConfig {

}
