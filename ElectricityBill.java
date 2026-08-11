package college.java;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the units consumed:");
		int unit=sc.nextInt();
		if(unit<=100)
			System.out.println(unit*1);
		else if(unit>100 && unit<=200)
			System.out.println(100*1+(unit-100)*2);
		else if(unit>200)
			System.out.println(100*1+100*2+(unit-300)*3);
		
	}

}
