import java.util.*;

public class Armstrong{
    public static void main(String []args){
        int num1,num2;

        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        sc.close();

        for(int i=num1;i<num2;i++){
		int rem,sum=0;
		int check=i;
			while(check!=0){
            rem=check%10;
            sum=sum+(rem*rem*rem);
            check=check/10;
		}
		if(sum==i){
		      System.out.println("Number is an Armstrong number"+ i);

		}
}
    }
    
}