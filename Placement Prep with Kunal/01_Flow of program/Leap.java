//Program for Leap year or not

import java.util.*;

public class Leap{
 public static void main(String args[]){
 	int year;

 	Scanner sc= new Scanner(System.in);
 	year=sc.nextInt();
	 sc.close();
	if(((year%4==0) && (year%100!=0)) || (year%400==0)){
		System.out.println("Leap Year");
	}
	else{
		System.out.println("Not Leap Year");
	}
 	}
 }