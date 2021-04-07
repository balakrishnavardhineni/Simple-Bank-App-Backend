
package com.app.newbank.dto;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transactions {
    private int id;
    private String transaction_id;
    private String transaction_mode;
    private Date transaction_date;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="customer_account_number",nullable = false)
    private int customerAccountNumber;
   
    public Transactions() {
		
	}
    public Transactions(int id, String transaction_id, String transaction_mode, Date transaction_date,
    		int customerAccountNumber) {
		super();
		this.id = id;
		this.transaction_id = transaction_id;
		this.transaction_mode = transaction_mode;
		this.transaction_date = transaction_date;
		this.customerAccountNumber = customerAccountNumber;
	}
	
    public String getTransaction_id() {
		return transaction_id;
	}
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
    
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}


	public String getTransaction_mode() {
		return transaction_mode;
	}


	public void setTransaction_mode(String transaction_mode) {
		this.transaction_mode = transaction_mode;
	}


	public Date getTransaction_date() {
		return transaction_date;
	}


	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public int getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public void setCustomerAccountNumber(int customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}

 }