package com.dcsoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching // 开启缓存支持
public class MainApplication {

	public static void main(String[] args) {
		/* AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
   	 DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
   	 DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
   	 DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
   	 DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
   	 
   	 System.out.println("S1 与S2是否相等 ："+ s1.equals(s2));
   	 System.out.println("P1 与P2是否相等 ："+ p1.equals(p2));
   	 
   	 JavaConfig javaConfig = context.getBean(JavaConfig.class);
   	 
   	 javaConfig.outputResource();
   	 
   	 context.close(); */
		
		SpringApplication.run(MainApplication.class, args);
	}
}
