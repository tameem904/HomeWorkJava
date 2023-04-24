package javaHw;

public class Practice {
    public static void main(String[] args) {

        /* How would you reverse a String word by word? for example
         input=>This is sentence i want to reverse
         output=>sihT si ecnetnes i tnaw ot esrever */


        String str = "This is sentence i want to reverse";

        String[] words = str.split(" ");
        String revString = "";

        for (int i = 0; i < words.length;i++){
            String word = words[i];
            String revWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
        System.out.println(revString);

    }
}