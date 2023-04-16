package javaHw;

public class HW2DArrays06 {

    public static void main(String[] args) {
/*
Create 2D array of countries: north america countries, south america countries,
europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored */

    String countries[][]= {
            {"America", "Canada", "Mexico",},
            {"Brazil", "Colombia", "Peru"},
            {"Germany", "Italy", "United Kingdom"},
            {"China", "India", "Russia"},
            {"Libya", "Mali", "Zimbabwe"}
    };

            for(String i []:countries){
                for(String j:i){

                    System.out.print(j+" ");
                }
            }
        System.out.println();
        System.out.println("*****************");


            for(int i = 0; i< countries.length; i++){
                for(int j = 0; j<countries[i].length; j++){
                    System.out.print(countries[i][j]+" ");
                }
            }



    }
}
