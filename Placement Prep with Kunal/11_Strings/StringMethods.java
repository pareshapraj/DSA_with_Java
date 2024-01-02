import java.util.*;

public class StringMethods {
    public static void main(String [] args){
        String name="Paresh Apraj";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.concat(name));
        System.out.println(name.contains("Apraj"));

        //String is imutable we can't modify string in Java language

        System.out.println(name.indexOf('a'));
        System.out.println("     paresh     ".trim());
        System.out.println(Arrays.toString(name.split(" ")));
        

        float a=34.8584993f;

        System.out.printf("formatted number is %.2f",a);
    }
}
