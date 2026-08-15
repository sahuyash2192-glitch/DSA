package college.java;

import java.util.Scanner;

public class AtmWithdrawl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your balance:");
		int balance=sc.nextInt();
		System.out.println("Enter your amt you want to withdraw or deposit:");
		int amt=sc.nextInt();
		System.out.println("type 1 for withdrawl and 2 for Deposit:");
		int n=sc.nextInt();
		switch(n) {
		
		case 1:if(amt%100==0 && amt<=balance)
			System.out.println("Withdrawl Succesfull"+"\n"+"current balance="+(balance-amt));
		else
			System.out.println("Error");
		break;
		case 2:if(amt>0)
			System.out.println("Deposit Successfull"+"\n"+"current balance="+(balance+amt));
		else
		System.out.println("Error");
		break;
		default:System.out.println("Invalid choice");
	}

}}
