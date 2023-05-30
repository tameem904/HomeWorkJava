package javaHw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*Create a Person class with following private fields: name, lastName, age, salary.  Variables should be
initialized through constructor.Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
Print each object details.
 */
public class Person {
    private String name;
    private String lastName;
    private int age;
    private int salary ;
    Person(String name,String lastName,int age,int salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}
class PersonTester{
    public static void main(String[] args) {
        LinkedHashMap<Person,Integer> person = new LinkedHashMap<>();

        person.put(new Person("John","Smith",22,80000),1234);
        person.put(new Person("JOe","Mac",45,100000),8978);
        person.put(new Person("Jack","Will",32,79000),9080);

        Set<Map.Entry<Person,Integer>> keyset= person.entrySet();
        for(Map.Entry<Person,Integer> p1:keyset) {
            System.out.println(p1+" "+p1.getValue());
        }
    }
}
