package com.app.newbank.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    private int id;
    private String name;
//	@OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL)
//	private List<CustomerAccount> CustomerAccount;

//    public List<CustomerAccount> getCustomerAccount() {
//		return CustomerAccount;
//	}
//
//	public void setCustomerAccount(List<CustomerAccount> customerAccount) {
//		this.CustomerAccount = customerAccount;
//		if (this.CustomerAccount != null) {
//			for (CustomerAccount customerAc : this.CustomerAccount) {
//				customerAc.setCustomer_id(this);
//			}
//		}
//	}

	public Customer() {
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
       
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}