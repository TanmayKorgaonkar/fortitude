package com.fortitude.serviceImpl;

import java.sql.SQLException;

import com.fortitude.dao.ProjectsDao;
import com.fortitude.dto.ProjectsDto;
import com.fortitude.service.ProjectsService;

public class ProjectsServiceImpl implements ProjectsService{
	
	
	private ProjectsDao projectsDao;
	
	public ProjectsDao getProjectsDao(){
		return projectsDao;
	}
	
	public void setProjectsDao(ProjectsDao projectsDao){
		this.projectsDao = projectsDao;
	}

	@Override
	public void addProjects(ProjectsDto projectsDto) throws SQLException {
		projectsDao.addNewProject(projectsDto);
	}

}
