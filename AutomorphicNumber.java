package loops;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,c=n;
		while(n!=0) {
			count++;
			n/=10;
		}
		int sqt=(int)Math.pow(c,2);
		int res=(int)(sqt%(Math.pow(10,count)));
		if(res==c)
			System.out.println("Automorphic");
		else
			System.out.println("Not a automorphic");
		}

}
