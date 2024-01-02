public class number {
    public static void main(String [] args){

        // print function with giving 1 arguments
        print(1);
    }

    public static void print(int n){

        // base condition to terminate recursion
        if(n==5){
            System.out.println(n);
            return;
        }

        //Printing the number
        System.out.println(n);

        //calling function "Print" in recursion format and giving the number+1 as a argument
        print(n+1);
    }
}
