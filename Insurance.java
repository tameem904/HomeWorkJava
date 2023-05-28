package javaHw;

import java.util.ArrayList;
import java.util.Iterator;

/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and
 cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class
  Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String carModel,String insuranceName){
        super(insuranceName);
        this.carModel=carModel;
    }
    @Override
    void getQuote(){
        System.out.println(insuranceName+"getQuote");
    }
    @Override
    void cancelInsurance() {
        System.out.println("cancel "+carModel+" Insurance");
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String petType,String insuranceName) {
        super(insuranceName);
        this.petType = petType;
    }
    @Override
    void getQuote(){
        System.out.println(insuranceName+" getQuote");
    }
    @Override
    void cancelInsurance() {
        System.out.println("cancel "+petType+" Insurance");
    }
}
class Health extends Insurance{
    Health(String insuranceName){
        super(insuranceName);
    }
    @Override
    void getQuote(){
        System.out.println(insuranceName+" getQuote");
    }
    @Override
    void cancelInsurance() {
        System.out.println("cancel Health Insurance");
    }
}
class InsuranceTester{
    public static void main(String[] args) {

        ArrayList<Insurance> insurances = new ArrayList<>();

        Car c1 = new Car(" Demon "," Geico ");
        insurances.add(c1);
        Pet p1 = new Pet(" Dog "," Doggydogg ");
        insurances.add(p1);
        Health h1 = new Health(" Anthem ");
        insurances.add(h1);

        for(Insurance insurance:insurances){
            insurance.getQuote();
            insurance.cancelInsurance();
        }
        Iterator<Insurance> insuranceIterator = insurances.iterator();
        while(insuranceIterator.hasNext()){
            Insurance next=insuranceIterator.next();
            next.cancelInsurance();
            next.getQuote();
        }
    }
}