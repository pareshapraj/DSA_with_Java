public class fibo {
    public static void main(String [] args){
        System.out.println(fibo1(6));
    }

    public static int fibo1(int n){

        //Base condition for termination of recursion
        if(n<2){
            return n;
        }
        return fibo1(n-1)+fibo1(n-2);
    }
}
