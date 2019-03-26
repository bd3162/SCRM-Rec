package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 */

@SpringBootApplication
public class RecoApplication extends SpringBootServletInitializer {
 
      public static void main( String[] args ){
    	SpringApplication.run(RecoApplication .class, args);
}
     /**
      *新增此方法
      */
      @Override
     protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(RecoApplication .class);
    }
}
   

