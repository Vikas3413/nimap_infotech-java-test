package com.Category.ProductProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Category.ProductProject.Dao.CategoryDao;
import com.Category.ProductProject.Entity.Category;
@Service
public class CategoryService {
	@Autowired
	CategoryDao categoryDao;

	public List<Category> getAllTheCategories() {
		return categoryDao.getAllTheCategories();
		
	}

	public String saveCategory(Category category) {
		return categoryDao.saveCategory(category);
		
	}

	public List<Category> getCategoryById(int id) {
		return categoryDao.getCategoryById(id);
		
	}
	
	public String updateCategory( int id, Category category) {
		return categoryDao.updateCategory(id,category);
	}

	public String deleteCategory(int id) {
		return categoryDao.deleteCategory(id);
	}

	
    
}
