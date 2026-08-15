package loops;

import java.util.Scanner;

public class KaprekarNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,c=n,sum=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		n=c;
		int sqt=(int)((n*n)%(Math.pow(10, count)));
		int d=(int)((n*n)/(Math.pow(10,count)));
	if((d+sqt)==c)
		System.out.println("Kaperekar Number");
	else
		System.out.println("not a Kaperekar Number");

}
}