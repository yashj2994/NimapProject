package com.project.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Project.dao.CategoryDao;
import com.project.Project.entity.Category;

@Service
public class CategoryService {

	@Autowired
	CategoryDao dao;

	public List<Category> getAllCategory() {
		
		List<Category> category=dao.getAllCategory();
		return category;
	}

	public boolean createNewCategory(Category category) {
		boolean insert=dao.createNewCategory(category);
		return insert;
	}

	public  Category getCategoryById(int id) {
		Category catg=dao.getCategoryById(id);
		return catg;
		
	}

	public boolean deleteCategoryById(int id) {
		boolean delet=dao.deleteCategoryById(id);
		return delet;
	}

	public boolean updateCategoryById(int id) {
		boolean update = dao.updateCategoryById(id);
		return update;
	}

}