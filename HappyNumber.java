package loops;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(true) {
			sum=0;
		while(n!=0) {
			sum+=Math.pow(n%10,2);
			n/=10;
		}
		if(sum==1) {
			System.out.println("Happy Number");
			break;
		}
		else if(sum==4) {
			System.out.println("Not a happy number");
			break;
		}
		else
			n=sum;
	}
		
	}
}
