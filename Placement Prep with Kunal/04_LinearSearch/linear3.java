public class linear3 {
    public static void main(String[] args) {
        String name="Paresh";
                  char target='r';
        System.out.println(search2(name,target));
    }

    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0; i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }


    //converting string to array and search in that array program

    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }

        for(char s: str.toCharArray()){
            if(target==s){
                return true;
            }
        }

        return false;
    }
}
