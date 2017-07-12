package com.dcsoft.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "custom")
public class JavaConfigProperty {
	
 	 
	 private String name;
 	 
 	 
	
	private String age;
 	 
 	 public void outputResource(){
 		 System.out.println(name);
 		 System.out.println(age);
 	 }
 	 
 	 public String getName() {
 		return name;
 	}

 	public void setName(String name) {
 		this.name = name;
 	}

 	public String getAge() {
 		return age;
 	}

 	public void setAge(String age) {
 		this.age = age;
 	}

}
