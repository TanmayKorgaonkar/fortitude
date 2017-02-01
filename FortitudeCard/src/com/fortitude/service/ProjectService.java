package com.fortitude.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fortitude.dto.ProjectDto;


public interface ProjectService {
	public List<ProjectDto> getAllProject() throws SQLException;
	void addProjects(ProjectDto projectDto) throws SQLException, ParseException;
	public ProjectDto getProjectById(String projectId) throws SQLException;
}
