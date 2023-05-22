package com.project.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Project.dao.ProductDao;
import com.project.Project.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;

	public List<Product> getAllProduct() {
		List<Product> product = dao.getAllProduct();
		return product;

	}

	public boolean createNewProduct(Product product) {
		boolean insert = dao.createNewProduct(product);
		return insert;

	}

	public Product getProductById(int id) {
		Product prod = dao.getProductById(id);
		return prod;

	}

	public boolean deleteProductById(int id) {
		boolean delet = dao.deleteProductById(id);
		return delet;
	}

	public boolean updateProductById(int id) {
		boolean update = dao.updateProductById(id);
		return update;
	}

}
