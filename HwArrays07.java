package javaHw;

public class HwArrays07 {

    public static void main(String[] args) {
        /*
        From an array of integer elements find the largest number.
         */

        int num[]={1,3,5,7,9,11};
        int largest=0;
       for(int i = 0; i< num.length;i++){
           if(num[i]>largest){
               largest=num[i];
           }

       }System.out.println(largest);

    }
}
