class Recursion1{
    public static void main(String [] args){
        Message();
    }

    static void Message(){
        System.out.println("Hello World");
        Message1();
    }

    static void Message1(){
        System.out.println("Hello World");
        Message2();
    }
              
    static void Message2(){
        System.out.println("Hello World");
        Message3();
    }

    static void Message3(){
        System.out.println("Hello World");
        Message4();
    }

    static void Message4(){
        System.out.println("Hello World");
    }
}