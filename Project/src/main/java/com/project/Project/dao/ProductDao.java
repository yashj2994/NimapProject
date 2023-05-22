package com.project.Project.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Project.entity.Product;

@Repository
public class ProductDao {
	@Autowired
	SessionFactory sf;

	public List<Product> getAllProduct() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Product.class);
		List<Product> product = criteria.list();
		session.close();
		return product;

	}

	public boolean createNewProduct(Product product) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(product);
		tr.commit();
		session.close();
		return true;

	}

	public Product getProductById(int id) {
		Session session = sf.openSession();
		Product prod = session.load(Product.class, id);
		session.close();
		return prod;
	}

	public boolean deleteProductById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Product prod = session.load(Product.class, id);
		session.delete(prod);
		tr.commit();
		session.close();
		return true;

	}

	public boolean updateProductById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Product prod = session.load(Product.class, id);
		session.update(prod);
		tr.commit();
		session.close();
		return true;

	}

}
