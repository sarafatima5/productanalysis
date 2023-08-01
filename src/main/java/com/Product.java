package com;

public class Product {
	private int producId;
	private String name;
	private float price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int producId, String name, float price) {
		super();
		this.producId = producId;
		this.name = name;
		this.price = price;
	}
	public int getProducId() {
		return producId;
	}
	public void setProducId(int producId) {
		this.producId = producId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [producId=" + producId + ", name=" + name + ", price=" + price + "]";
	}
	

}
