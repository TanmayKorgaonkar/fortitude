package com.fortitude.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fortitude.dao.UserRoleDao;
import com.fortitude.dto.RoleDto;

public class UserRoleDaoImpl implements UserRoleDao{

	@Override
	public void addUserRole(Connection connection, String id, String role) throws SQLException {
		try{

			PreparedStatement preparedStatement = connection.prepareStatement(ADD_ROLE);
			preparedStatement.setString(1,id);
			preparedStatement.setString(2,role);
			preparedStatement.executeUpdate();
			System.out.println("User Role added");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public static String ADD_ROLE = "INSERT INTO role(id, user_role) values (?,?)";

}
