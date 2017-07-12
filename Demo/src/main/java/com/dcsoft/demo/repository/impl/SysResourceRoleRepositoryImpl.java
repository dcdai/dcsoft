package com.dcsoft.demo.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.dcsoft.demo.repository.SysResourceRoleRepositoryCustom;


public class SysResourceRoleRepositoryImpl implements SysResourceRoleRepositoryCustom {
	@PersistenceContext(unitName="SimplePU")
    private EntityManager entityManager;
	
	/*@Override
	public List<Mpmenu> findByUserName(String userName) {
		String sql = " select distinct d.menuCode,d.menuName,d.defaultUrl from t_mpuser a, t_mpuserroles b, t_mprolemenus c, t_mpmenus d ";
		sql = sql + " where a.id = b.userId and b.roleName = c.roleName and c.menuCode= d.menuCode and a.name = '" + userName + "'";;
		List<Object[]> menuResult = entityManager.createNativeQuery(sql).getResultList();
		List<Mpmenu> menuSet = new ArrayList<Mpmenu>();
		for (int i = 0; i < menuResult.size(); i++)
		{
			Object[] curResult = menuResult.get(i);
			Mpmenu oneDto = new Mpmenu();
			oneDto.setMenuCode((String)curResult[0]);
			oneDto.setMenuName((String)curResult[1]);
			oneDto.setDefaultUrl((String)curResult[2]);
			menuSet.add(oneDto);
		}
		return menuSet;
	}*/
	
	/*@Override
	public List<SpringRoleMenus> getAllRoleMenus(){
		String sql = " select c.id, e.role_Name,d.resource_String,d.resource_Name from sys_resource_role c, sys_resource d,sys_role e  where c.role_Id= e.id and d.id = c.resource_Id";
		List<Object[]> menuResult = entityManager.createNativeQuery(sql).getResultList();
		List<SpringRoleMenus> roleMenus = new ArrayList<SpringRoleMenus>();
		for (int i = 0; i < menuResult.size(); i++)
		{
			Object[] curResult = menuResult.get(i);
			SpringRoleMenus oneDto = new SpringRoleMenus();
			oneDto.setRoleName((String)curResult[1]);
			oneDto.setUrl((String)curResult[2]);
			oneDto.setMenuCode((String)curResult[3]);
			roleMenus.add(oneDto);
		}
		return roleMenus;
	}*/
	
	public List<Object[]> getResultArrayByNativeQuery(String nativeSql){
		Query nativeQuery = entityManager.createNativeQuery(nativeSql);
		return nativeQuery.getResultList();
	}
	
	public List<Object> getResultObjectByNativeQuery(String nativeSql){
		Query nativeQuery = entityManager.createNativeQuery(nativeSql);
		return nativeQuery.getResultList();
	}
}
