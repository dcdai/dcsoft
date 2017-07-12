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
@Table(name="sys_user_role")  
public class SysUserRole {  
    @Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    @Column (name="id",length=10)  
    private Long id;  
 /*     
    @ManyToOne(fetch = FetchType.LAZY)  
    @JoinColumn(name = "uid", nullable = false)  
    private SysUser SUser;//角色对应的用户实体  
*/   
    
    @Column(name="userId")  
    private Long userId;//角色名称  
    
    public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	@Column(name="roleId",length=100)  
    private Long roleId;//角色ID  
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Column(name="roleName",length=100)  
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
  /*  public SysUser getSUser() {  
        return SUser;  
    }  
    public void setSUser(SysUser sUser) {  
        SUser = sUser;  
    }  */
      
      
}
