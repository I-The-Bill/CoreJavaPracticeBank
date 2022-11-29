package com.dollarsBank.model;

public class SavingsAccount 
{
	
		public int id;
		public int userId;
		public double amount;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public double getIntrestRate() {
			return intrestRate;
		}
		public void setIntrestRate(double intrestRate) {
			this.intrestRate = intrestRate;
		}
		public double getMaintainceFee() {
			return maintainceFee;
		}
		public void setMaintainceFee(double maintainceFee) {
			this.maintainceFee = maintainceFee;
		}
		public double intrestRate;
		public double maintainceFee;
	
}
