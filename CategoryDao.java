package com.Category.ProductProject.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Category.ProductProject.Entity.Category;

@Repository
public class CategoryDao {
	@Autowired
	SessionFactory sf;
	public List<Category> getAllTheCategories() {
		Session session=sf.openSession();
		Criteria criteria= session.createCriteria(Category.class);
		List<Category> list=criteria.list();
		System.out.println(list);
		return list;
		
	}


	public String saveCategory(Category category) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();

		session.save(category);

		tx.commit();

		return "Data successfully insert in to table";
	}
	
	public List<Category> getCategoryById(int id) {
		Session session=sf.openSession();
		Criteria criteria= session.createCriteria(Category.class);
		criteria.add(Restrictions.eq("id", id));
	 List<Category> list=	criteria.list();
		return list;
	}



	public String updateCategory( int id, Category category) {
		
Session session=sf.openSession();

// criteria API is ONLY FOR retrival (getting data from database)

Transaction tx=session.beginTransaction();
Category category1=new Category();
category1.setCid(id);
category1.setCname(category.getCname());

	session.update(category1);
	
tx.commit();

return "update successfully";		
	}


	public String deleteCategory(int id) {
		
		Session session=sf.openSession();
		Transaction tr = session.beginTransaction();
		Category  category1=session.get(Category.class, id);
		session.delete(category1);
		tr.commit();
		session.close();
	 return"Delete category successfully";
	}


	
}
