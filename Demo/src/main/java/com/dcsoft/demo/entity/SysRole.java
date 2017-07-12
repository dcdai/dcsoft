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
//角色表  
@Entity  
@Table(name="sys_role")  
public class SysRole {  
    @Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    @Column (name="id",length=10)  
    private Long id;  
 /*     
    @ManyToOne(fetch = FetchType.LAZY)  
    @JoinColumn(name = "uid", nullable = false)  
    private SysUser SUser;//角色对应的用户实体  
*/   
    
   
	@Column(name="role_Name",length=100)  
    private String roleName;//角色名称  
      
    public Long getId() {  
        return id;  
    }  
    public void setId(Long id) {  
        this.id = id;  
    }  
      
    public String getRoleName() {  
        return roleName;  
    }  
    public void setRoleName(String roleName) {  
        this.roleName = roleName;  
    }  
   
      
}
