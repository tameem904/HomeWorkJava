package javaHw;

public class StringHW02 {
    public static void main(String[] args) {


        //How would you check if String is palindrome or not? aba=> true Abbc =>false

        String word="mom";

        String rev="";
        for (int i = word.length()-1; i >= 0 ; i--) {
            rev=rev+word.charAt(i);}
            if(rev.equalsIgnoreCase(word)){
                System.out.println("Its a palindrome");

            }
            else{
                System.out.println("Its not a palindrome");
            }


    }
}
