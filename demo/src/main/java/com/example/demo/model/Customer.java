package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "com.example.demo.model.Customer 13131")
@Table(name = "CUSTOMER")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "CUSTOMER")
	private String customer;
	
	@Column(name = "SALE_ID")
	private Long customerSaleId;
	
	@Column(name = "PURCHASE_ID")
	private Long customerPurchaseId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Long getCustomerSaleId() {
		return customerSaleId;
	}

	public void setCustomerSaleId(Long customerSaleId) {
		this.customerSaleId = customerSaleId;
	}

	public Long getCustomerPurchaseId() {
		return customerPurchaseId;
	}

	public void setCustomerPurchaseId(Long customerPurchaseId) {
		this.customerPurchaseId = customerPurchaseId;
	}
	
	

}
