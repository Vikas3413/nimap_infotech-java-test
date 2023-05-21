package com.Category.ProductProject.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Category {
	@Id
	private int cid;
	private String Cname;
@OneToMany(targetEntity =Product.class ,cascade=CascadeType.ALL)
@JoinColumn (name="cid")
List<Product> product;
	
	public Category() {
		
	}

	public Category(int cid, String cname, List<Product> product) {
		super();
		this.cid = cid;
		Cname = cname;
		this.product = product;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", Cname=" + Cname + ", product=" + product + "]";
	}


	

}
