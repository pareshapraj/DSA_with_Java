import java.util.*;

public class Calculator{
     public static void main(String []args){
     float num1=0,num2=0;
     String str;

     //System.out.println("Enter First Number and second number");

     Scanner sc=new Scanner(System.in);
     //num1=sc.nextFloat();
     //num2=sc.nextFloat();

     str=sc.nextLine();

     //System.out.println(str);
	
     if(str.contains("+")){

     String[] arrstr=str.split("\\+");

     for(int i=0;i<arrstr.length;i++){
		  //System.out.println(s);
		 	 	 		 num1=Integer.parseInt(arrstr[0]);
		 			     num2=Integer.parseInt(arrstr[1]);

	 }
	 System.out.println(num1+num2);
	 }

	 if(str.contains("-")){

	      String[] arrstr=str.split("\\-");

	      for(int i=0;i<arrstr.length;i++){
	 		  //System.out.println(s);
			 	 	 		 num1=Integer.parseInt(arrstr[0]);
			 			     num2=Integer.parseInt(arrstr[1]);

	 }
	 System.out.println(num1-num2);
	 }

	 if(str.contains("*")){

	      String[] arrstr=str.split("\\*");

	      for(int i=0;i<arrstr.length;i++){
	 		  //System.out.println(s);
			 	 	 		 num1=Integer.parseInt(arrstr[0]);
			 			     num2=Integer.parseInt(arrstr[1]);

	 }
	 System.out.println(num1*num2);
	 }

	 if(str.contains("*")){

	      String[] arrstr=str.split("\\+");

	      for(int i=0;i<arrstr.length;i++){
	 		  //System.out.println(s);
			 	 	 		 num1=Integer.parseInt(arrstr[0]);
			 			     num2=Integer.parseInt(arrstr[1]);

	 }
	 System.out.println(num1%num2);
	 }

	 if(str.contains("/")){

	      String[] arrstr=str.split("\\/");

	      for(int i=0;i<arrstr.length;i++){
	 		  //System.out.println(s);
			 	 	 		 num1=Integer.parseInt(arrstr[0]);
			 			     num2=Integer.parseInt(arrstr[1]);

	 } System.out.println(num1/num2);
	 }
	  if(str.contains("%")){

	 	      String[] arrstr=str.split("\\%");

	 	      for(int i=0;i<arrstr.length;i++){
	 	 		 //System.out.println(s);
	 	 		 num1=Integer.parseInt(arrstr[0]);
			     num2=Integer.parseInt(arrstr[1]);
	}
	System.out.println(num1%num2);
}

	/*
     System.out.println("Enter Operation +,-,*,/,%");
     char1=sc.next().charAt(0);

     if(char1=='+'){
		 System.out.println("The Sum of two numbers are="+(num1+num2));
	}
	 if(char1=='-'){
			 System.out.println("The Subtraction of two numbers are="+(num1-num2));
	}
	 if(char1=='*'){
			 System.out.println("The Multiplication of two numbers are="+(num1*num2));
	}
	 if(char1=='/'){
	 		 System.out.println("The Division of two numbers are="+(num1/num2));
	}
	 if(char1=='%'){
			 System.out.println("The Modulus of two numbers are="+(num1%num2));
	}
*/
 	sc.close();

     }

}