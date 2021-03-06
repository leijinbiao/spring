package com.czklps.bean.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.czklps"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfigAop {
}
