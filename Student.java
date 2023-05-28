package javaHw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.*/
public class Student {
    public static void main(String[] args) {

        HashMap<String,Integer> students= new HashMap<>();
        students.put("Ahmed",221);
        students.put("Shela",332);
        students.put("Fara",112);
        students.put("Konica",222);
        students.put("Chirag",919);

        Set<String> names = students.keySet();
        for(String name:names){
            System.out.println(name);
        }
        Set<Map.Entry<String,Integer>>entrySet=students.entrySet();

        for(Map.Entry<String, Integer> entry:entrySet){
            System.out.println(entry);

        }
    }
}
