package com.fortitude.serviceImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fortitude.dao.AccountDao;
import com.fortitude.dao.ProjectDao;
import com.fortitude.dto.ProjectDto;
import com.fortitude.service.ProjectService;

public class ProjectServiceImpl implements ProjectService{

	
	@Autowired
	private ProjectDao projectDao;
	
	public ProjectDao getProjectDao() {
		return projectDao;
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}



	@Override
	public List<ProjectDto> getAllProject() {
		// TODO Auto-generated method stub
		
		return projectDao.getAllProjects();
	}

}
