package javaHw;

public class HwArrays05 {

    public static void main(String[] args) {

      /*  Create an array of animals and store 5 elements into it.
      Using 2 different loops print all elements from the array.
       */

        String animals[]={"Panda","Lion","Sloth","Bear","Gorilla"};
        int i =0;
        while(i< animals.length) {
            System.out.print(animals[i] + " ");
            i++;
        }
        System.out.println();
        for (int j = 0; j < animals.length; j++) {
            System.out.print(animals[j]+" ");

        }
    }
}
