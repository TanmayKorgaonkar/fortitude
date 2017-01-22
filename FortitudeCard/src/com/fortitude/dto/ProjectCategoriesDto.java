package com.fortitude.dto;

import java.util.List;

import com.fortitude.enums.CategoryEnum;

public class ProjectCategoriesDto {
	String projectId;
	List<String> categoryEnum;
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public List<String> getCategoryEnum() {
		return categoryEnum;
	}
	public void setCategoryEnum(List<String> categoryEnum) {
		this.categoryEnum = categoryEnum;
	}
	public ProjectCategoriesDto(String projectId, List<String> categoryEnum) {
		super();
		this.projectId = projectId;
		this.categoryEnum = categoryEnum;
	}
	
}
