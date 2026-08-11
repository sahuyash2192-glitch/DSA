package college.java;

import java.util.Scanner;

public class CabFareCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the distance travelled:");
	int dis=sc.nextInt();
	System.out.println("Enter the time in hours:");
	int hour=sc.nextInt();
	double total = 0;
	if(dis<=5)
		total=10*dis+50;
	if(dis>5 && dis<=15)
		total=5*10+(dis-5)*8+50;
	if(dis>15)
		total=5*10+10*8+(dis-15)*6+50;	
	System.out.print("Your Total Cab fare is:");
	if((0<=hour && hour<=5) || hour==22 || hour==23)
System.out.println(total*0.2+total);
	else
		System.out.println(total);
		}

		}
		

