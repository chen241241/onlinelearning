package com.ck.onlinelearning.config;

import com.ck.onlinelearning.interceptor.Intercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by black on 18-12-3.
 */
@Configuration
public class WebApplicationConfig implements WebMvcConfigurer {
    @Autowired
    private Intercepter intercepter;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }
//配置拦截器 除了login和logout等
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(intercepter).addPathPatterns("/**")
                .excludePathPatterns("/login")
                .excludePathPatterns("/register")
                .excludePathPatterns("/logout");
    }
}
