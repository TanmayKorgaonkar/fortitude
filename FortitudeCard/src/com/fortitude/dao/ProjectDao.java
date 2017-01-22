package com.fortitude.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.fortitude.dto.ProjectDto;


public interface ProjectDao {
	public List<ProjectDto> getAllProjects();

	void addNewProject(ProjectDto projectDto) throws ParseException, SQLException;
}
