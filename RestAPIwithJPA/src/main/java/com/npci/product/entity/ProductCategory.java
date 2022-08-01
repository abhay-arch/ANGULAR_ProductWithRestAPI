package com.npci.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PRODUCTCATEGORY")
public class ProductCategory {

	@Id			//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) 	//autoincrement
	@Column(name="CATEGORYID") 
	private int categoryid;
	
	@Column(name="PRODUCTCATEGORYNAME")
	private String productcategoryname;

	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductCategory(int categoryid, String productcategoryname) {
		super();
		this.categoryid = categoryid;
		this.productcategoryname = productcategoryname;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getProductcategoryname() {
		return productcategoryname;
	}

	public void setProductcategoryname(String productcategoryname) {
		this.productcategoryname = productcategoryname;
	}

	@Override
	public String toString() {
		return "ProductCategory [categoryid=" + categoryid + ", productcategoryname=" + productcategoryname + "]";
	}
	
	
}
