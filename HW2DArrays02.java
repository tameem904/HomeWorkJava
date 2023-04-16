package javaHw;

public class HW2DArrays02 {
    public static void main(String[] args) {
        /*Create 2D array of cars : american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops
         */
        String[][] cars = {
                {"american", "german", "korean",},
                {"Chevrolet","Mercedes","Kia"}

        };
       // for (String[] i : cars) {
        //   for (String j : i) {
        //      System.out.println(j);}}

        for (int i = 0; i < cars.length; i++) {
            for(int j = 0; j < cars[i].length; j++){
                System.out.println(cars[i][j]);
            }


        }
    }
}