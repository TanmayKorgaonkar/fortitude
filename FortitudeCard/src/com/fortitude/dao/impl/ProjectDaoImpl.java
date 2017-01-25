package com.fortitude.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.fortitude.dao.CategoryDao;
import com.fortitude.dao.ProjectDao;
import com.fortitude.dto.ProjectCategoriesDto;
import com.fortitude.dto.ProjectDto;
import com.fortitude.enums.ReturnTypes;

public class ProjectDaoImpl implements ProjectDao {
	
	CategoryDao categoryDao;
	
	DataSource dataSource;
	
	public CategoryDao getCategoryDao(){
		return this.categoryDao;
	}
	
	public void setCategoryDao(CategoryDao categoryDao){
		this.categoryDao=categoryDao;
	}

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
			Connection connection = dataSource.getConnection();

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
	public void addNewProject(ProjectDto projectDto) throws ParseException, SQLException {
		System.out.println("coming here");
		try{
			String scheduledEnd = projectDto.getProjectScheduledEndTime();
			String actualEnd = projectDto.getProjectActualEndTime();
			Date currentDate = new Date();
			
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD");
			String currentString = formatter.format(currentDate);
			Date currentSqlDate = (Date)formatter.parse(currentString);
			Date scheduledEndDate = (Date)formatter.parse(scheduledEnd);
			Date actualEndDate = (Date)formatter.parse(actualEnd);
					
			//String plannedDate = projectDto.getProjectScheduledEndTime();
		
			Connection connection = (Connection)dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(ADD_PROJECT);
			String projectId = projectDto.getProjectId();
			preparedStatement.setString(1, projectId);
			preparedStatement.setString(2, projectDto.getProjectName());
			preparedStatement.setString(3, projectDto.getProjectOwner());
			preparedStatement.setLong(4, projectDto.getProjectCost());
			//preparedStatement.setString(5, projectDto.getProjectCategory());
			preparedStatement.setString(5, projectDto.getProjectDetails());
			preparedStatement.setString(6, projectDto.getProjectExternalLink());
			preparedStatement.setLong(7, projectDto.getMinimumAmountToInvest());
			preparedStatement.setDate(8,new java.sql.Date(currentSqlDate.getTime()));
			preparedStatement.setDate(9, new java.sql.Date(scheduledEndDate.getTime()));
			preparedStatement.setDate(10, new java.sql.Date(actualEndDate.getTime()));
			preparedStatement.setBoolean(11, false);
			preparedStatement.setDouble(12, projectDto.getReturnPromised());
			preparedStatement.setString(13, projectDto.getReturnType().toString());
			preparedStatement.executeUpdate();
			

			System.out.println("Category Called");
			categoryDao.addCategory(connection, new ProjectCategoriesDto(projectId, projectDto.getProjectCategory()));
			System.out.println("Dao called");
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
		project.setProjectOwner(resultSet.getString(3));
		project.setProjectCost(resultSet.getLong(4));
		project.setProjectDetails(resultSet.getString(5));
		project.setProjectExternalLink(resultSet.getString(6));
		project.setMinimumAmountToInvest(resultSet.getLong(7));
		project.setProjectStartTime(resultSet.getString(8));
		project.setProjectScheduledEndTime(resultSet.getString(9));
		
		project.setProjectActualEndTime(resultSet.getString(10));
		project.setTargetMet(resultSet.getBoolean(11));
		project.setReturnPromised(resultSet.getDouble(12));
		project.setCurrentInvestment(resultSet.getLong(14));
		project.setReturnType(resultSet.getString(13));
		return project;
	}
	
	@Override
	public ProjectDto getProjectById(String projectId) throws SQLException {
		try{
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_PROJECT_BY_ID);
			preparedStatement.setString(1, projectId);
			ResultSet resultSet = preparedStatement.executeQuery();
			ProjectDto projectDto = new ProjectDto();
			while(resultSet.next()){
				projectDto = makeProjectDto(resultSet);
			}
			System.out.println(projectDto);
			return projectDto;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	private final static String GET_ALL_PROJECTS = "Select * from projects";
	private final static String ADD_PROJECT = "insert into projects (project_id, project_name, project_owner, project_amount, project_details, project_external_link, minimum_amount_to_invest,"
+"project_start_time, project_scheduled_end_time, project_actual_end_time, target_met, returned_promised, return_type) values (?,?,?,?,?, ?,?, ?,?,?,?,?, ?)";
	private final static String GET_PROJECT_BY_ID = "select * from projects where project_id =?";

	
}
