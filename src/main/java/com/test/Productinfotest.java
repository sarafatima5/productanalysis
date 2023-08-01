package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

import com.Product;
import com.productdb;
import com.productinfosys;
public class Productinfotest {

	@Test
	public void testGetProductInfo() {
		productdb pr=mock(productdb.class);
		Product o=new Product(1,"coffee",23);
		Product o1=new Product(2,"icetea",90);
		when(pr.getProduct(1)).thenReturn(o);
		when(pr.getProduct(2)).thenReturn(o1);
		productinfosys prsys=new productinfosys(pr);
		
		Product pro=prsys.getProductInfo(1);
		String name=pro.getName();
		float price=pro.getPrice();
		assertEquals("coffee",name);
	}

}
