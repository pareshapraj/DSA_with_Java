import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        // ArrayList<Integer> list=new ArrayList<>();

        // Scanner sc=new Scanner(System.in);

        // for(int i=0;i<10;i++){
        //     int n=sc.nextInt();
        //     list.add(n);
        // }
        // list.add(12);

        // if(list.contains(5)){
        //     System.out.println("Number Contains in list");
        // }

        // //updation arraylist
        // list.set(0,30);

        // //deleting element in list 
        // list.remove(5);


        // //item at any index

        // for(int i=0;i<5;i++){
        //     System.out.println(list.get(i));
        // }
        // System.out.println(list);


        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for(int i=0;i<3;i++){       //adding the arraylist int arraylist in java like 2d arraylist
            list.add(new ArrayList<>());
        }
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
        sc.close();
    }
}
