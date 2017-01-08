package com.fortitude.dao.impl;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.fortitude.dao.ProjectDao;
import com.fortitude.dto.AccountDto;
import com.fortitude.dto.ProjectDto;

public class ProjectDaoImpl implements ProjectDao {
	

	@Autowired
	DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
	    this.dataSource = dataSource;
	}
	
	public DataSource getDataSource(){
		return this.dataSource;
	}
	
//	Connection conn = null;
//	
//	public Connection getConnection(){
//		if(this.conn!=null){
//		try {
//			this.conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/fortitudeDb","root","root");
//			if(this.conn!=null){
//				System.out.println("Connection Established");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//		return this.conn;
//	}
	
	@Override
	public List<ProjectDto> getAllProjects() {
		// TODO Auto-generated method stub
		try{
			Connection connection = (Connection)dataSource.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PROJECTS);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			List<ProjectDto> projects = new ArrayList<ProjectDto>();
			
			while(resultSet.next()){
				ProjectDto project =  makeProjectDto(resultSet);
				projects.add(project);
			}
			return projects;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void addNewProject(ProjectDto projectDto) {
		try{
			Connection connection = (Connection)dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(ADD_PROJECT);
			preparedStatement.setString(1, projectDto.getProjectId());
			preparedStatement.setString(2, projectDto.getProjectName());
			preparedStatement.setString(3, projectDto.getProjectOwner());
			preparedStatement.setString(4, projectDto.getProjectCost());
			preparedStatement.executeUpdate();

			System.out.println("Project Added.");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	private ProjectDto makeProjectDto(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		ProjectDto project = new ProjectDto();
		project.setProjectId(resultSet.getString(1));
		project.setProjectName(resultSet.getString(2));
		project.setProjectCost(resultSet.getString(3));
		project.setProjectCategory(resultSet.getString(4));
		project.setProjectDetails(resultSet.getString(5));
	
		return project;
	}

	private static String GET_ALL_PROJECTS = "Select * from projects";
	public final static String ADD_PROJECT = "INSERT INTO PROJECTS(project_id, project_name, project_owner, project_amount) values (?, ?, ?, ?)";
}
