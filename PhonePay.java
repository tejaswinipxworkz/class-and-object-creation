package com.xworkz.oops;

public class PhonePay {

	String userName;
	long phoneNum;
	long adharNum;
	String place;
	int panNum;

	public void displayInfo() {
		System.out.println(this.userName);
		System.out.println(this.phoneNum);
		System.out.println(this.adharNum);
		System.out.println(this.place);
		System.out.println(this.panNum);

	}

	PhonePay(String userName, long phoneNum, long adharNum, String place, int panNum) {
		System.out.println("Registration successful using all parameters");
		this.userName = userName;
		this.phoneNum = phoneNum;
		this.adharNum = adharNum;
		this.place = place;
		this.panNum = panNum;
	}

	PhonePay(String userName, long phoneNum, int panNum, long adharNum) {
		System.out.println("Registration successful using username,phonenum,pannum,adharnum");
		this.userName = userName;
		this.phoneNum = phoneNum;
		this.panNum = panNum;
		this.adharNum = adharNum;
	}

	PhonePay(String userName, long phoneNum, long adharNum) {
		System.out.println("Registration successful using username,phonenum,adharnum");
		this.userName = userName;
		this.phoneNum = phoneNum;
		this.adharNum = adharNum;
	}

	PhonePay(String userName, String place) {
		System.out.println("Registration successful using username,place");
		this.userName = userName;
		this.place = place;
	}

	public void transferMoney() {
		System.out.println("Money transfered");
	}

	public void rechargeMobile() {
		System.out.println("Mobile recharge successfully");
	}

	public void electricityBill() {
		System.out.println("Electricity bill paid successfully");
	}

	public void waterBill() {
		System.out.println("Water bill paid successfully");
	}
}
