package com.mphasis.billsystem;

public class BillGenerator {

	public static void main(String[] args) {
		
		int units = 250;
		double billToPay = 0;
		if(units < 100)
		{
			billToPay = units * 1.20;
		}
		else if(units < 300)
		{
			billToPay = 100 * 1.20 + (units - 100) * 2;
		}
		
		System.out.println("The electricity bill for " +units+ " is : " + billToPay);

	}

}
