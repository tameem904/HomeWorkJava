package javaHw;

public class StringMethodHw02 {

    public static void main(String[] args) {

//Create a String and print it in reverse order (Sunday → yadnuS).


         String weekend="Sunday";
        for (int i = weekend.length()-1; i >= 0; i--) {
            System.out.print(weekend.charAt(i));

        }


    }
}
