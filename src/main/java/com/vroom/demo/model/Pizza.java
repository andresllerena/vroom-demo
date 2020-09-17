package com.vroom.demo.model;

import java.math.BigDecimal;

public class Pizza {
	String imageURL;
	String name;
	BigDecimal price;
	
	public Pizza(String imageURL, String name, BigDecimal price) {
		this.imageURL = imageURL;
		this.name = name;
		this.price = price;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
