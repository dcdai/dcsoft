package com.dcsoft.demo.entity;

import java.util.Date;  

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.FetchType;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.JoinColumn;  
import javax.persistence.ManyToOne;  
import javax.persistence.Table;  
@Entity  
@Table(name="sys_resource_role")  
public class SysResourceRole {  
        @Id  
        @GeneratedValue(strategy=GenerationType.IDENTITY)  
        @Column (name="id",length=10)  
        private Long id;  
          
        @Column(name="role_Id",length=50)  
        private Long roleId; //角色ID  
          
        @Column(name="resource_Id",length=50)  
        private Long resourceId;//资源ID  
          
        @Column(name="update_Time")  
        private Date updateTime;//更新时间  
  
        public Long getId() {  
            return id;  
        }  
  
        public void setId(Long id) {  
            this.id = id;  
        }  
  
        public Long getRoleId() {  
            return roleId;  
        }  
  
        public void setRoleId(Long roleId) {  
            this.roleId = roleId;  
        }  
  
        public Long getResourceId() {  
            return resourceId;  
        }  
  
        public void setResourceId(Long resourceId) {  
            this.resourceId = resourceId;  
        }  
  
        public Date getUpdateTime() {  
            return updateTime;  
        }  
  
        public void setUpdateTime(Date updateTime) {  
            this.updateTime = updateTime;  
        }  
  
          
} 
