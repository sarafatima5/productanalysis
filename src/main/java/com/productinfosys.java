package com;

public class productinfosys {
	productdb pr;
	public productinfosys(productdb pr) {
		this.pr=pr;
	}
	public Product getProductInfo(int productId) {
		return pr.getProduct(productId);
	}
}
