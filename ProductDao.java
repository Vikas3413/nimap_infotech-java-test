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
import com.Category.ProductProject.Entity.Product;
@Repository
public class ProductDao {
	@Autowired
	SessionFactory sf;

	
		public List<Category> getAllTheProduct() {
			Session session=sf.openSession();
			Criteria criteria= session.createCriteria(Product.class);
			List<Category> list=criteria.list();
			System.out.println(list);
			return list;
			
		}


		public String saveProduct(Product product) {
			Session session=sf.openSession();
			Transaction tr=session.beginTransaction();

			session.save(product);

			tr.commit();

			return "Data successfully insert in to table";
		}


		public List<Product> getProductById(int id) {
			Session session=sf.openSession();
			Criteria criteria= session.createCriteria(Product.class);
			criteria.add(Restrictions.eq("id", id));
		 List<Product> list=criteria.list();
			return list;
			}


		public String updateProduct(int id, Product product) {
			Session session=sf.openSession();
			Criteria criteria=session.createCriteria(Product.class);
			Transaction tr=session.beginTransaction();
            Product product1=new Product();
            product1.setPid(id);
            product1.setName(product.getName());
            product1.setPrice(product.getPrice());
            product1.setcid(product.getcid());
            session.update(product1);
			tr.commit();
			session.close();
			return "Data successfully update in to table";
		}


		public String deleteProduct(int id) {
			Session session=sf.openSession();
			Transaction tr = session.beginTransaction();
			Product  product1=session.get(Product.class, id);
			session.delete(product1);
			tr.commit();
			session.close();
			return "Data successfully deleted in to table";
		}
		
}
