import java.util.*;

public class Palidrome{
	public static void main(String args[]){
		String s;

		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();

		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}

		if(s.equals(rev)){
			System.out.println("String is palidrome");
		}
		else{
			System.out.println("String is not Palidrome");
		}
		sc.close();
	}
}