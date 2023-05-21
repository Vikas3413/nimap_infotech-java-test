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
import com.Category.ProductProject.Entity.Product;
import com.Category.ProductProject.Service.ProductService;

@RestController
@RequestMapping("api")
public class ProductController {
	@Autowired
	ProductService productservice;

	@GetMapping("product")
	public List<Category> getAllTheProduct() {
		return productservice.getAllTheProduct();
	}
	@PostMapping("newproduct")
	public String saveProduct(@RequestBody Product product)
	{
		//System.out.println(category);

		return productservice.saveProduct(product);
	}
	
	@GetMapping("product/{id}")
	public List<Product> getProductById(@PathVariable int id) {
		return productservice.getProductById(id);
	}

	@PutMapping("updateProduct/{id}")
	public String updateProduct(@PathVariable int id, @RequestBody Product product)
	{
		return productservice.updateProduct(id,product);
	}

	//delete data;
	@RequestMapping("deleteproduct/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		return productservice.deleteProduct(id);
	}
}
