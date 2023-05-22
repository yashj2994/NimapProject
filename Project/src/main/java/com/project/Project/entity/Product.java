package com.project.Project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	private int productid;
	private String productname;
	private int rate;
	private int fkcp;

	public int getFkcp() {
		return fkcp;
	}

	public void setFkcp(int fkcp) {
		this.fkcp = fkcp;
	}

	@Id
	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", rate=" + rate + ", fkcp=" + fkcp
				+ "]";
	}

}
