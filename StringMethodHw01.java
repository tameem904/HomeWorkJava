package javaHw;

public class StringMethodHw01 {

    public static void main(String[] args) {

   /*  Create a String and if the String is not empty perform the following:
   if the String has an odd number of characters and has 3 or more characters,
   print the character in the middle of the String.For Example String str=hello =>l  */


        String  word="Hello";
        if(!word.isEmpty()){
            if(word.length()>=3 & word.length()%2!=0){
             int middle=word.length()/2;
             char middleChar=word.charAt(middle);
                System.out.println(middleChar);




            }


        }

    }
}
