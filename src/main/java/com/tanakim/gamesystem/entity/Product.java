package com.tanakim.gamesystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="game_system")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="product_name")
	public String product_name;
	
	@Column(name="product_description")
	public String product_description;
	
	@Column(name="product_price")
	public double product_price;
	
	@Column(name="product_image")
	public String product_image;
	
	public Product() {}

	public Product(int id, String product_name, String product_description, double product_price,
			String product_image) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_price = product_price;
		this.product_image = product_image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", product_description=" + product_description
				+ ", product_price=" + product_price + ", product_image=" + product_image + "]";
	}
	
}
