package com.yang.jzb.web.config;

import com.yang.jzb.web.interceptor.CustomerSessionInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yang hituzi
 * @description 
 * @date 
 */
@Configuration
public class WebMap implements WebMvcConfigurer {

    @Value("${file.load-Path}")
    private String loadPath;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("").setViewName("");
    }


    /**
     * @param registry 全局的session拦截器
     * @author hj
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomerSessionInterceptor())
                .addPathPatterns("/consign/**")
                .addPathPatterns("/business/**")
                .excludePathPatterns("/404", "/static/**", "/", "swagger-ui", "/pay/callback/**")
                .excludePathPatterns("/swagger-resources/**", AppConfig.resourceName + "**");
    }

    /**
     * Swagger2和图片资源配置
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/*").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("**").addResourceLocations(loadPath);
    }
}
