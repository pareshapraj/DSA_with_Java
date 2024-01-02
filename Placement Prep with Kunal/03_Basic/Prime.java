import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        
        System.out.println(isPrime(no));
       
        sc.close();
    }

    static boolean isPrime(int num){
        //int flag=0;
        int n=2;
         while(n*n <=num){
            if(num%n==0){
                // flag=1;
                return false;
            }
            n++;
        }
        return n*n > num;
        // if(flag==0){
        //     System.out.println("Number is Prime");
        // }
        // else{
        //     System.out.println("Number is not Prime");
        // }

    }
    
}
