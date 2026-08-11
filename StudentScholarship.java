package college.java;

import java.util.Scanner;

public class StudentScholarship {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your attendence:");
		int att=sc.nextInt();
		System.out.println("Enter Your marks:");
		int marks=sc.nextInt();
		int pass=0;
		if(att<75 || marks<40)
			System.out.println("Fail");
		else {
			System.out.println("Pass");
		pass++;}
		if(pass==1) {
			if(marks>=90)
				System.out.println("100% Scholarship");
			else if(marks<90 && marks>=75)
				System.out.println("50% Scholarship");
			else if(marks<75 && marks>=60)
				System.out.println("25% Scholarship");
			else
				System.out.println("0% Scholarship");
			
		}
	
	}

}
