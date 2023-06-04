package javaHw;
/*
Create a method to check age eligibility that will throw a runtime exception.
Method should throw an exception age is less than 16.*/
public class ExceptionHW {
    static void ageEligibility(int age){
        if(age<16){
            throw new RuntimeException("age is less than 16");
        }
    }
    public static void main(String[] args) {

        try {
            ageEligibility(12);
            System.out.println("Age is eligible.");
        } catch (RuntimeException e) {
            System.out.println("Age is not eligible: "+ e.getMessage());
        }
    }
}
