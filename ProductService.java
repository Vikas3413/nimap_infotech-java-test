package com.Category.ProductProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Category.ProductProject.Dao.ProductDao;
import com.Category.ProductProject.Entity.Category;
import com.Category.ProductProject.Entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao productdao;
	public List<Category> getAllTheProduct() {
		return productdao.getAllTheProduct();
	}
	public String saveProduct(Product product) {
		return productdao.saveProduct(product);
	}
	public List<Product> getProductById(int id) {
		return productdao.getProductById( id);
	}
	public String updateProduct(int id, Product product) {
		return productdao.updateProduct(id,product);
	}
	public String deleteProduct(int id) {
		return  productdao.deleteProduct(id);
	}
	
}
