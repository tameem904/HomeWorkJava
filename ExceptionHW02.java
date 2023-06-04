package javaHw;
/*Create a method checkUserName that will throw a runtime exception. Method should throw an exception when
entered username is less than 5 characters.*/
public class ExceptionHW02 {

    static void checkUserName(String name){
        if(name.length()<5){
            throw new RuntimeException("username is less than 5 characters");
        }
    }

    public static void main(String[] args) {

        try{
            checkUserName("name");
            System.out.println("Username is valid.");
        }
        catch (RuntimeException e){
            System.out.println("Username is not valid. "+e.getMessage());
        }
    }
}
