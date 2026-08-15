package loops;

import java.util.Scanner;

public class AdamNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int revsqt=0,rev=0;
		int sqt=(int)Math.pow(n, 2);
		while(sqt!=0) {
			int rem=sqt%10;
			 revsqt=revsqt*10+rem;
			 sqt/=10;
		}
		while(n!=0) {
			int rem2=n%10;
			rev=rev*10+rem2;
			n/=10;
		}
		int res=(int)Math.pow(rev, 2);
		if(res==revsqt)
			System.out.println("Adam Number");
		else
			System.out.println("Not a Adam number");
		
		
	}

}
