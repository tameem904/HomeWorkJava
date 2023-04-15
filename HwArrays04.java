package javaHw;

public class HwArrays04 {

    public static void main(String[] args) {

        /*
        Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
         */

        String cars[]={"Lexus","Toyota","Maserati","Cadillac","Demon","Jaguar"};
        int i =0;
        while(i< cars.length){
            System.out.print(cars[i]+" ");
            i++;
        }
        System.out.println();
        for (int j = 0; j < cars.length; j++) {
            System.out.print(cars[j]+" ");

        }
    }
}
