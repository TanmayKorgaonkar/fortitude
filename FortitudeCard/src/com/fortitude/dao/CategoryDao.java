package com.fortitude.dao;

import java.sql.SQLException;

import com.fortitude.dto.ProjectCategoriesDto;

public interface CategoryDao {
	public void addCategory(ProjectCategoriesDto categoryDto) throws SQLException;
}
