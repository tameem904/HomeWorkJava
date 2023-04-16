package javaHw;

public class HW2DArrays04 {

    public static void main(String[] args) {

        /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers.*/

        int num[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        for(int i[]:num){
            for(int j : i){
            sum=sum+j;

        }


    }
        System.out.println(sum);
    }
}
