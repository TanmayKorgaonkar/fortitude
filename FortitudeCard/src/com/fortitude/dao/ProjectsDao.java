package com.fortitude.dao;

import java.util.List;

import com.fortitude.dto.ProjectsDto;

public interface ProjectsDao {
	
	public void addNewProject(ProjectsDto projectDto);
	
	public void updateProject(ProjectsDto projectDto);
	
	public ProjectsDto getProjectById(String projectId);
	
	public List<ProjectsDto> getAllProjectsList();

}
