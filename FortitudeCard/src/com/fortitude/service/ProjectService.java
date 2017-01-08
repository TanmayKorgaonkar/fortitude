package com.fortitude.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fortitude.dto.ProjectDto;


public interface ProjectService {
	public List<ProjectDto> getAllProject();
}
