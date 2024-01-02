public class panagram {
    static void isPresent(String str){
        str=str.toLowerCase();

        boolean allPresent=true;

        for(char ch='a';ch<='z';ch++){
            if(!str.contains(String.valueOf(ch))){
                allPresent=false;
                break;
            }
        }

        if(allPresent)
            System.out.println("Yes Paranogram");
        else
            System.out.println("NO not paragram");
    }
    public static void main(String[] args) {
        String str= "qwertyuijhgfdsazxcvbnm";

        isPresent(str);
    }
}
