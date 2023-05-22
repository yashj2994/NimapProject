package com.project.Project.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Project.entity.Category;

@Repository
public class CategoryDao {

	@Autowired
	SessionFactory sf;

	public List<Category> getAllCategory() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Category.class);
		List<Category> category = criteria.list();
		
		return category;

	}

	public boolean createNewCategory(Category category) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(category);
		tr.commit();
		session.close();
		return true;

	}

	public Category getCategoryById(int id) {

		Session session = sf.openSession();
		Category categ = session.load(Category.class, id);
		session.close();
		return categ;
	}

	public boolean deleteCategoryById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Category categ = session.load(Category.class, id);
		session.delete(categ);
		tr.commit();
		session.close();
		return true;

	}

	public boolean updateCategoryById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Category categ = session.load(Category.class, id);
		session.update(categ);
		tr.commit();
		session.close();
		return true;
	}

}
