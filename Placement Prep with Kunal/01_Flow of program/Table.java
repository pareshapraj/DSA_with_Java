//Take a number and make a multiplication table of it

import java.util.*;

public class Table{
   public static void main(String args[]){

   	int count=0;
   	int num;
	
	System.out.println("Enter Number");
   	Scanner sc=new Scanner(System.in);
   	num=sc.nextInt();
	   sc.close();

   	while(count<=10){
   	System.out.println(num + " " + "*" + " " + count + " " + "=" + (num*count));
   	count++;
   	}
   }
}