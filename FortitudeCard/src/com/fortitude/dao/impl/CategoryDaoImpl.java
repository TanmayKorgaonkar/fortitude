package com.fortitude.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.fortitude.dao.CategoryDao;
import com.fortitude.dto.ProjectCategoriesDto;
import com.fortitude.enums.CategoryEnum;
import java.sql.Connection;

public class CategoryDaoImpl implements CategoryDao{
	/*@Autowired
	DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
	    this.dataSource = dataSource;
	}
	
	public DataSource getDataSource(){
		return this.dataSource;
	}*/
	@Override
	public void addCategory(Connection connection, ProjectCategoriesDto categoryDto) throws SQLException {
		try{PreparedStatement preparedStatement = connection.prepareStatement(ADD_CATEGORIES);
		String projectId = categoryDto.getProjectId();
		List<String> enumList = categoryDto.getCategoryEnum();
		for (int i =0 ;i <enumList.size();i++){
		preparedStatement.setString(1, projectId);
		preparedStatement.setString(2, enumList.get(i).toString());
		}
		preparedStatement.executeBatch();
		System.out.println("Batch executed");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	private static final String ADD_CATEGORIES = "INSERT INTO projects_category (project_id, category) values (?,?)";

	

}
