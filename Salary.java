package javaHw;

import java.util.HashMap;

/*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the
highest salary. Output should be in the below format John Smith=$100000*/
public class Salary{
    public static void main(String[] args) {

        HashMap<String,Integer> emp = new HashMap<>();
        emp.put("John Smith",100000);
        emp.put("Will Jones",82000);
        emp.put("Ali Tua",72000);
        emp.put("Sam Samoa",99000);
        for(var e:emp.entrySet()){
            if(e.getValue()>=100000){
                System.out.println(e.getKey()+" = $"+e.getValue());
            }
        }
    }
}
