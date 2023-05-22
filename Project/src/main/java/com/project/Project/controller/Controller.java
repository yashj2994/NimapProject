package com.project.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Project.entity.Category;
import com.project.Project.entity.Product;
import com.project.Project.service.CategoryService;
import com.project.Project.service.ProductService;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	ProductService ps;

	@Autowired
	CategoryService cs;

	@GetMapping("/fetchallcategory")
	public List<Category> getAllCategory() {
		List<Category> category = cs.getAllCategory();
		return category;
	}

	@GetMapping("/fetchallproduct")
	public List<Product> getAllProduct() {
		List<Product> product = ps.getAllProduct();
		return product;
	}


	@PostMapping("/addnewcategory")
	public boolean createNewCategory(@RequestBody Category category) {
		boolean insert = cs.createNewCategory(category);
		return insert;
	}

	@PostMapping("/addnewproduct")
	public boolean createNewProduct(@RequestBody Product product) {
		boolean insert = ps.createNewProduct(product);
		return insert;
	}

	@PutMapping("/getcategory/{id}")
	public Category getCategoryById(@PathVariable int id) {
		Category catg = cs.getCategoryById(id);
		return catg;
	}

	@PutMapping("/getproduct/{id}")
	public Product getProductById(@PathVariable int id) {
		Product prod = ps.getProductById(id);
		return prod;

	}

	@DeleteMapping("/deletecategory/{id}")
	public boolean deleteCategoryById(@PathVariable int id) {
		boolean delet = cs.deleteCategoryById(id);
		return delet;
	}

	@DeleteMapping("/deleteproduct/{id}")
	public boolean deleteProductById(@PathVariable int id) {
		boolean delet = ps.deleteProductById(id);
		return delet;
	}
	@PutMapping("/updatecategory/{id}")
	public boolean updateCategoryById(@PathVariable int id) {
		boolean update = cs.updateCategoryById(id);
		return  update;
	}
	
	@PutMapping("/updateproduct/{id}")
	public boolean updateProductById(@PathVariable int id) {
		boolean update = ps.updateProductById(id);
		return  update;
	}
	
	
	

}
