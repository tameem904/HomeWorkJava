package javaHw;

public class StringHW1 {
    public static void main(String[] args) {

        String str="This is sentence i want to reverse";
        String word[]=str.split(" ");
        String revString="";

        for (int i = 0; i <word.length ; i++) {
            String words=word[i];
            String revWord="";

            for (int j = words.length()-1; j >=0 ; j--) {
                revWord=revWord+words.charAt(j);
            }
            revString=revString+revWord+" ";
        }
        System.out.println(revString);
    }
}
