package com.dcsoft.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.dcsoft.demo.entity.SysUserRole;

public interface SysUserRoleRepository extends Repository<SysUserRole, Long> {

	 
	/*@Query(value = "from SysUser u where u.name=:name")
	List<SysUser> findByName1(@Param("name") String name);

	@Query(value = "select * from #{#entityName} u where u.name=?1", nativeQuery = true)
	List<SysUser> findByName2(String name);*/

	List<SysUserRole> findByUserId(Long userId);
}
