package loops;

import java.util.Scanner;

public class DizarianNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,sum=0,c=n;
		while(n!=0) {
			count++;
			n/=10;
		}
		n=c;
		for(int i=count;i>0;i--) {
			 sum+=Math.pow(c%10, i);
			 c/=10;
		}
		
		if(n==sum)
			System.out.println("Dizarian number");
		else
			System.out.println("Not a dizarian number");
		
		
	}

}
