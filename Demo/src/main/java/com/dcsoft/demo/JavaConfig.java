package com.dcsoft.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dcsoft.springbootdome.scope")

public class JavaConfig {
	
 	 @Value("abcd")
	 private String testString;
 	 
 	 @Value("${book.name}")
	 private String bookName;
 	 
 	 public void outputResource(){
 		 System.out.println(testString);
 		 System.out.println(bookName);
 	 }
}
