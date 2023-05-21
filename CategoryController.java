package com.Category.ProductProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Category.ProductProject.Entity.Category;
import com.Category.ProductProject.Service.CategoryService;

@RestController
@RequestMapping("api")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@GetMapping("categories")
	public List<Category> getAllTheCategories() {
		return categoryService.getAllTheCategories();
	}

	@PostMapping("newcategory")
	public String saveCategory(@RequestBody Category category)
	{
		//System.out.println(category);

		return categoryService.saveCategory(category);
	}
	
	@GetMapping("categories/{id}")
	public List<Category> getCategoryById(@PathVariable int id) {
		return categoryService.getCategoryById(id);
	}

	@PutMapping("updateCategory/{id}")
	public String updateCategory(@PathVariable int id, @RequestBody Category category)
	{
		return categoryService.updateCategory(id,category);
	}

	//delete data;
	@RequestMapping("deleteCategory/{id}")
	public String deleteCategory(@PathVariable int id)
	{
		return categoryService.deleteCategory(id);
	}

}
