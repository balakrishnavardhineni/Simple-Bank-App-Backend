package com.app.newbank.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer_account")
public class CustomerAccount {
    private int id;
    private int account_balance;
    private String account_type;
    @Id
	@Column(name = "account_number")
    private int account_number;
    @ManyToOne
	@JoinColumn(name = "customer_id")
    private Customer customerId;
    @ManyToOne
	@JoinColumn(name = "bank_id")
    private Bank bankId;
//    @OneToMany(mappedBy = "customerAccountNumber", cascade = CascadeType.ALL)
//   	private List<Transactions> transactions;
    
    public CustomerAccount() {
    }

    public CustomerAccount(int id,int account_balance,
     String account_type,
     int account_number,
     Customer customerId,
     Bank bankId) {
        this.id = id;
        this.account_balance =  account_balance;
        this.account_type = account_type;
         this.account_number =  account_number;
          this.customerId =  customerId;
          this.bankId= bankId;
    }
	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Bank getBankId() {
		return bankId;
	}

	public void setBankId(Bank bankId) {
		this.bankId = bankId;
	}

//	public List<Transactions> getTransactions() {
//		return transactions;
//	}
//
//	public void setTransactions(List<Transactions> transactions) {
//		this.transactions = transactions;
//		if (this.transactions != null) {
//			for (Transactions customerAc : this.transactions) {
//				customerAc.setCustomerAccountNumber(this);
//			}
//		}
//	}

	public int getId() {
		return id;
	}

	public int getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(int account_balance) {
		this.account_balance = account_balance;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCustomer_id(Customer customerId) {
		this.customerId = customerId;
	}

	public void setBank_id(Bank bankId) {
		this.bankId = bankId;
	}
   }