package com.Category.ProductProject.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int pid;
	private String pname;
	private int price;
	private int cid;
	
	public Product() {
		
	}


	public Product(int pid, String name, int price ,int cid) {
		super();
		this.pid = pid;
		this.pname = name;
		this.price = price;
		this.cid=cid;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return pname;
	}


	public void setName(String name) {
		this.pname = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	public int getcid() {
		return cid;
	}


	public void setcid(int cid) {
		this.cid = cid;
	}




	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + pname + ", price=" + price + "]";
	}

	
}
