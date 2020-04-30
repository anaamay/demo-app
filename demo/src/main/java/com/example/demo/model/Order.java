package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name ="com.example.demo.model.Order1233")
@Table(name = "ORDER_DETAILS")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "ORDER_NO")
	private String orderNo;
	
	 @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 @JoinColumn(name ="customerSaleId")
	 private Customer customerSale;

	 @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 @JoinColumn(name ="customerPurchaseId")
	 private Customer customerPurchase;
	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Customer getCustomerSale() {
		return customerSale;
	}

	public void setCustomerSale(Customer customerSale) {
		this.customerSale = customerSale;
	}

	public Customer getCustomerPurchase() {
		return customerPurchase;
	}

	public void setCustomerPurchase(Customer customerPurchase) {
		this.customerPurchase = customerPurchase;
	}

	
}
