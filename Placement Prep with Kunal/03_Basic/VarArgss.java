import java.util.Arrays;

public class VarArgss {
    public static void main(String[] args) {
        //System.out.println("hello");
        fun(1,2,3,5,6,7); //three dots is like vecoterd array in java

        fun2(1,2,1,4,4,6,78,98,65,4,42,64);
    }

    static void fun2(int a,int b, int ...s){
        System.out.println(a+" "+b);
        System.out.println(Arrays.toString(s));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
