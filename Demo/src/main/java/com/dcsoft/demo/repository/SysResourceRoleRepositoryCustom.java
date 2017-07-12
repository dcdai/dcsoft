package com.dcsoft.demo.repository;

import java.util.List;

//import com.java.framework.security.entity.SpringRoleMenus;

public interface SysResourceRoleRepositoryCustom {

	 
	//public List<SpringRoleMenus> getAllRoleMenus();
	
	public List<Object[]> getResultArrayByNativeQuery(String nativeSql);
	
	public List<Object> getResultObjectByNativeQuery(String nativeSql);
}
