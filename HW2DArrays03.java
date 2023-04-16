package javaHw;

public class HW2DArrays03 {
    public static void main(String[] args) {

        /*
  Using 2D array create a grocery list.Inside you should have an array of veggies, fruits, dairy and sweets.
  Retrieve all values from that array using 2 different loops.*/

        String[][] grocery = {
                {"Broccoli", "Onion", "Lettuce",},
                {"Melon","Grape","Berry"},
                {"Milk","Cheese","Butter"},
                {"Chocolate","Lollipop","Cake"}
        };
         for (String[] i : grocery) {
        for (String j : i) {
            System.out.print(j+ " ");}}
        System.out.println(" ");
        System.out.println("*********");

        for (int i = 0; i < grocery.length; i++) {
            for(int j = 0; j < grocery[i].length; j++){
                System.out.print(grocery[i][j]+" ");
            }


        }
    }
}



