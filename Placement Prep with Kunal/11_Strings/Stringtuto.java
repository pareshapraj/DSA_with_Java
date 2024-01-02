class Stringtuto{
    public static void main(String args[]){
        
        //Diffrance between the == sign and the .equals sign

        String a="Paresh";
        String b="Paresh";
        //Above both the variables are pointing to the same variable 
        //a & b are both pointin to same object in heap data structure

        System.out.println(a==b);
        //true

        System.out.println(a.equals(b));
        //true


        //creating same data but pointing to the two diffrent variables in heap
        String name1=new String("Paresh");
        String name2=new String("Paresh");

        System.out.println(name1==name2);
        //false , cause they are pointing to two diffrent objects

        System.out.println(name1.equals(name2));
        //true
    }
}