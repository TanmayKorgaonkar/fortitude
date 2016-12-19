package com.fortitude.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.fortitude.dao.ProjectsDao;
import com.fortitude.dto.ProjectsDto;

public class ProjectsDaoImpl implements ProjectsDao{
	DataSource dataSource;
	
	public DataSource getDataSource(){
		return this.dataSource;
	}
	
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
	}
	
	/*CREATE TABLE FortitudeDB.projects (
			project_id VARCHAR(45) NOT NULL,
			project_name VARCHAR(99) NOT NULL,
			project_owner VARCHAR(45) NOT NULL,
			project_amount BIGINT,

			FOREIGN KEY (project_owner) REFERENCES FortitudeDB.accounts(account_id),
			PRIMARY KEY(project_id)
			);
	*/
	@Override
	public void addNewProject(ProjectsDto projectDto) {
		try{
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(ADD_PROJECT);
			preparedStatement.setString(1, projectDto.getProjectId());
			preparedStatement.setString(2, projectDto.getProjectName());
			preparedStatement.setString(3, projectDto.getProjectOwner());
			preparedStatement.setLong(4, projectDto.getProjectAmount());
			preparedStatement.executeUpdate();

			System.out.println("Project Added.");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateProject(ProjectsDto projectDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectsDto getProjectById(String projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectsDto> getAllProjectsList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public final static String ADD_PROJECT = "INSERT INTO PROJECTS(project_id, project_name, project_owner, project_amount) values (?, ?, ?, ?)";

}
