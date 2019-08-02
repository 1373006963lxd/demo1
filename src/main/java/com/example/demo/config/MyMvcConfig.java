package com.example.demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//使用WebMvcConfigurationSupport可以扩展SpringMVc的功能
//全面接管springMvc，使得SpringMvc的自动配置都失效，静态页面不能被访问
//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter/*extends WebMvcConfigurationSupport */{

/*
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
//        访问连接atguigu跳转到success页面
        registry.addViewController("atguigu").setViewName("index");
    }*/


//    所有的WebMvcConfigurationSupport组件都会一起起作用
    //将组件注册到容器中
   /* @Bean
    public WebMvcConfigurationSupport webMvcConfigurationSupport() {
        WebMvcConfigurationSupport support = new WebMvcConfigurationSupport() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("login").setViewName("login");
            }
            };
                    return support;
    }*/
}
