package com.dcsoft.demo.entity;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity  
@Table(name="sys_resource")  
public class SysResource {  
        @Id  
        @GeneratedValue(strategy=GenerationType.IDENTITY)  
        @Column (name="id",length=10)  
        private Long id;  
          
        @Column(name="resource_String",length=1000)  
        private String resourceString;//url  
          
        @Column(name="resource_Id",length=50)  
        private String resourceId;//资源ID  
          
        @Column(name="remark",length=200)  
        private String remark;//备注  
          
        @Column(name="resource_Name",length=400)  
        private String resourceName;//资源名称  
          
        @Column(name="method_Name",length=400)  
        private String methodName;//资源所对应的方法名  
          
        @Column(name="method_Path",length=1000)  
        private String methodPath;//资源所对应的包路径  
          
        public Long getId() {  
            return id;  
        }  
  
        public void setId(Long id) {  
            this.id = id;  
        }  
  
        public String getResourceString() {  
            return resourceString;  
        }  
  
        public void setResourceString(String resourceString) {  
            this.resourceString = resourceString;  
        }  
  
        public String getResourceId() {  
            return resourceId;  
        }  
  
        public void setResourceId(String resourceId) {  
            this.resourceId = resourceId;  
        }  
  
        public String getRemark() {  
            return remark;  
        }  
  
        public void setRemark(String remark) {  
            this.remark = remark;  
        }  
  
        public String getResourceName() {  
            return resourceName;  
        }  
  
        public void setResourceName(String resourceName) {  
            this.resourceName = resourceName;  
        }  
  
        public String getMethodName() {  
            return methodName;  
        }  
  
        public void setMethodName(String methodName) {  
            this.methodName = methodName;  
        }  
  
        public String getMethodPath() {  
            return methodPath;  
        }  
  
        public void setMethodPath(String methodPath) {  
            this.methodPath = methodPath;  
        }  
          
          
}  
