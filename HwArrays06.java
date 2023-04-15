package javaHw;

public class HwArrays06 {

    public static void main(String[] args) {

        /*Create an array on integers and calculate the sum of all elements in an array*/

        int num[]={21,44,87,2};
        int sum=0;
        for (int i = 0; i <num.length ; i++) {
            sum=sum+num[i];

        }System.out.println(sum);

    }
}
