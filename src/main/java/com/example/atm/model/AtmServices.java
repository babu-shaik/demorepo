package com.example.atm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class AtmServices {
	@Column
	private int id;
	@Column
	private String bankName;
	@Column
	private int caardNumber;
	@Column
	private String cardName;
	@Column
	private int pinNumber;
	@Column
	private int cvvNumber;
	@Column
	private String panNumber;
	@Column
	private float amount;
	@Column
	private int mobileNumber;
	@Column
	private int accountNumber;
	@Column
	private int payeeMobileNumber;
	@Column
	private String IfscCode;
	

	public AtmServices(int id, String bankName, int caardNumber, String cardName, int pinNumber, int cvvNumber,
			String panNumber, float amount, int mobileNumber, int accountNumber, int payeeMobileNumber,
			String ifscCode) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.caardNumber = caardNumber;
		this.cardName = cardName;
		this.pinNumber = pinNumber;
		this.cvvNumber = cvvNumber;
		this.panNumber = panNumber;
		this.amount = amount;
		this.mobileNumber = mobileNumber;
		this.accountNumber = accountNumber;
		this.payeeMobileNumber = payeeMobileNumber;
		IfscCode = ifscCode;
	}

	public AtmServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPayeeMobileNumber() {
		return payeeMobileNumber;
	}

	public void setPayeeMobileNumber(int payeeMobileNumber) {
		this.payeeMobileNumber = payeeMobileNumber;
	}

	public String getIfscCode() {
		return IfscCode;
	}

	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getCaardNumber() {
		return caardNumber;
	}

	public void setCaardNumber(int caardNumber) {
		this.caardNumber = caardNumber;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public int getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "AtmServices [id=" + id + ", bankName=" + bankName + ", caardNumber=" + caardNumber + ", cardName="
				+ cardName + ", pinNumber=" + pinNumber + ", cvvNumber=" + cvvNumber + ", panNumber=" + panNumber
				+ ", amount=" + amount + ", mobileNumber=" + mobileNumber + ", accountNumber=" + accountNumber
				+ ", payeeMobileNumber=" + payeeMobileNumber + ", IfscCode=" + IfscCode + "]";
	}

}
