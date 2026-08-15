package college.java;

import java.util.Scanner;

public class ArmstongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int n=sc.nextInt();
		int rem,x=n,count=0;
		int c=n;
		while(n>0) {
		n=n/10;
		count++;
		}
		int rem2=0;
		while(x>0) {
			rem2+=Math.pow(x%10,count);
			x=x/10;
		}
		if(c==rem2)
		System.out.println(" it is a Armstrong number is:"+rem2);
		else
			System.out.println("Not a armstong number");
	}

}
