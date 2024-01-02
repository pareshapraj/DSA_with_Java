class Performance{
    public static void main(String [] args){
        String series="";

        for(int i=0;i<26;i++){
            char ch=(char)('a' + i);
            series=series+ch;   //series+=ch
        }

        System.out.println(series);


        //this above program going to waste lots of memory in computer to modify strings
        //because of this java introduced StringBuilder Class in Java

        StringBuilder builder=new StringBuilder();

        for(int j=0;j<26;j++){
            char ch =(char)('a' + j);
            builder.append(ch);
        }

        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}