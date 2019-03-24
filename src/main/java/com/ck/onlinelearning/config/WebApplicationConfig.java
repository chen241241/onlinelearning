package com.ck.onlinelearning.config;

import com.ck.onlinelearning.interceptor.Intercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

/**
 * Created by black on 18-12-3.
 */
@Configuration
@EnableWebMvc
public class WebApplicationConfig implements WebMvcConfigurer {
    @Autowired
    private Intercepter intercepter;
//    原因是因为默认路径虽然是在static下，但并没有包含static 下的各个文件夹，因此当我们把静态文件移入这些文件夹后，spring boot就不认识了。因此，为了让spring boot认识，我们需要添加一个配置类来把我们自己的路径添加进去，具体代码如下
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/")
                .setCacheControl(CacheControl.maxAge(1,TimeUnit.HOURS).cachePublic());
    }

//配置拦截器 除了login和logout等
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(intercepter).addPathPatterns("/**")
//                .excludePathPatterns("/login")
//                .excludePathPatterns("/static/**")
//                .excludePathPatterns("/register")
//                .excludePathPatterns("/page/**")
//                .excludePathPatterns("/logout");
//    }
}
