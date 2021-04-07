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
@Table(name = "bank")
public class Bank {
    private int id;
    private String code;
    private String branch;
    private String name;
//    @OneToMany(mappedBy = "bankId", cascade = CascadeType.ALL)
//	private CustomerAccount customerAccount;
    
//    public CustomerAccount getCustomerAccount() {
//		return customerAccount;
//	}
//
//	public void setCustomerAccount(CustomerAccount customerAccount) {
//		this.customerAccount = customerAccount;
//		
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bank() {
    }

    public Bank(int id, String code, String branch) {
        this.id = id;
        this.code = code;
        this.branch = branch;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setId(int id) {
		this.id = id;
	}
   }