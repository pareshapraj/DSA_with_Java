import java.util.*;

public class EvenOdd{
	public static void main(String args[]){
		int num;

		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		if(num%2==0){
			System.out.println("Number is Even="+num);
		}
		else{
			System.out.println("Number is Odd"+num);
		}
		sc.close();
	}
}