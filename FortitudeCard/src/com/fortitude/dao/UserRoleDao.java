package com.fortitude.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.fortitude.dto.RoleDto;

public interface UserRoleDao {
	
	public void addUserRole(Connection connection, String id, String role) throws SQLException;

}
