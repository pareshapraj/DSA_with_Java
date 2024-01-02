//Program for HCF and LCM

import java.util.*;

public class HCF_LCM{
 public static void main(String args[]){
 	int num1,num2;
 	int high;

 	Scanner sc=new Scanner(System.in);
 	num1=sc.nextInt();
 	num2=sc.nextInt();
	sc.close();
	for(high=num1<num2?num1:num2;high>=1;high--){
		if(num1%high==0 && num2%high==0){
			break;

 	}
	}

	System.out.println("HCF of the Given Numbers="+high);
	int i=1;
	for( i=1;i<=(num1*num2);i++)
		if(i%num1==0 && i%num2==0)
			break;

	System.out.println("LCM of the Given Numbers="+i);
	
 }
  
}