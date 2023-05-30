package javaHw;

import java.util.ArrayList;

/*Create a collection of integers in which you can keep duplicates. Write a logic to find sum of all integers*/
public class CollectionArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
         int sum=0;

         for(int i =0; i < list.size();i++){
             sum=sum+list.get(i);
         }
        System.out.println(sum);

    }
}
