package com.fortitude.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.fortitude.dto.ProjectCategoriesDto;

public interface CategoryDao {
	public void addCategory(Connection connection,ProjectCategoriesDto categoryDto) throws SQLException;
}
