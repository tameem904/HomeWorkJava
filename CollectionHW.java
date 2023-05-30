package javaHw;

import java.util.LinkedHashSet;

/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
public class CollectionHW{
    public static void main(String[] args) {

        LinkedHashSet<String> unique=new LinkedHashSet<>();
        unique.add("Snicker");
        unique.add("Twix");
        unique.add("Snicker");
        unique.add("KitKat");
        unique.add("KitKat");
        unique.add("Hershey");

        for(String u1:unique){
            String e = u1.concat(u1);
            System.out.println(e);
        }
    }
}
