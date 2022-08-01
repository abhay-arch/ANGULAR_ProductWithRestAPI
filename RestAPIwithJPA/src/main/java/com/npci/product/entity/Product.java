package com.npci.product.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id			//primary key
//	@GeneratedValue(strategy=GenerationType.IDENTITY) 	//autoincrement
	@Column(name="ID") 
	private int id;
	
	
	@Column(name="SKU")
	private String sku;
			
	@Column(name="PRODUCTNAME")
	private String productname;
	
	@Column(name="DESCRIPTIONS") 
	private String descriptions;
	
	@Column(name="UNITPRICE")
	private double uniteprice;
	
	@Column(name="imageurl")
	private String imageurl;
	
	@Column(name="UNITSINSTOCK")
	private int unitinstock;
	
	@Column(name="DATECREATED")
	private Date datecreated;
	
	@Column(name="LASTUPDATED")
	private Date lastupdated;
	
	@Column(name="CATEGORYID")
	private int categoryid;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String sku, String productname, String descriptions, double uniteprice, String imageurl,
			int unitinstock, Date datecreated, Date lastupdated, int categoryid) {
		super();
		this.id = id;
		this.sku = sku;
		this.productname = productname;
		this.descriptions = descriptions;
		this.uniteprice = uniteprice;
		this.imageurl = imageurl;
		this.unitinstock = unitinstock;
		this.datecreated = datecreated;
		this.lastupdated = lastupdated;
		this.categoryid = categoryid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public double getUniteprice() {
		return uniteprice;
	}

	public void setUniteprice(double uniteprice) {
		this.uniteprice = uniteprice;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public int getUnitinstock() {
		return unitinstock;
	}

	public void setUnitinstock(int unitinstock) {
		this.unitinstock = unitinstock;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public Date getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", sku=" + sku + ", productname=" + productname + ", descriptions=" + descriptions
				+ ", uniteprice=" + uniteprice + ", imageurl=" + imageurl + ", unitinstock=" + unitinstock
				+ ", datecreated=" + datecreated + ", lastupdated=" + lastupdated + ", categoryid=" + categoryid + "]";
	}
	
			

}
