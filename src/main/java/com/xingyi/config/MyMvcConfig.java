package com.xingyi.config;

import com.xingyi.component.LoginHandlerInterceptor;
import com.xingyi.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//所有的springMVC自动配置全部失效
//@EnableWebMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //zhuce lanjieqi
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //静态资源怎么办
        //springboot已经做好了静态资源映射
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/","/user/login");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送 /atguigu 请求来到success
        registry.addViewController("/atguigu").setViewName("success");

    }
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
     WebMvcConfigurer adapter = new WebMvcConfigurer() {
         @Override
         public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/").setViewName("register");
            registry.addViewController("/index.html").setViewName("login");
            registry.addViewController("/main.html").setViewName("dashboard");
         }
      } ;
     return  adapter;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();

    }
}

