package com.fortitude.service;

import java.sql.SQLException;

import com.fortitude.dto.ProjectsDto;

public interface ProjectsService {
	
	public void addProjects(ProjectsDto projectsDto) throws SQLException;

}
