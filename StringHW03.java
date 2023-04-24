package javaHw;

public class StringHW03 {
    public static void main(String[] args) {


       //How would you swap  2 strings without a temporary variable?

        String a="Almonds";
        String b="Peanut";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
