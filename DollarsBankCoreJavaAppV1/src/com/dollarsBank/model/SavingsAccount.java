package com.dollarsBank.model;

public class SavingsAccount 
{
	
		public int id;
		public int userId;
		public double amount;

		
		public SavingsAccount(int id, int userAccountNumber, Double depo) 
		{
			this.setId(id);
			this.setUserId(userAccountNumber);
			this.setAmount(depo);
		}
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


	
}
