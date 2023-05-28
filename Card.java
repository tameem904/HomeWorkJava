package javaHw;

import java.util.Iterator;
import java.util.LinkedList;

/* Create a Card class that will have interest rate field and card type and a constructor that will initialize
the fields.Create 3 objects of different card and store them into LinkedList. Using for loop/
advanced for loop/ iterator access all methods of the class.*/
public class Card{
    double interestRate;
    String cardType;
    Card(double interestRate,String cardType){
        this.interestRate=interestRate;
        this.cardType=cardType;
    }
    void printInfo(){
        System.out.println("interest rate = "+interestRate+" cardType "+cardType);
    }
}
class CardTester{
    public static void main(String[] args) {
        Card c1=new Card(5.5,"Credit");
        Card c2=new Card(2.4,"Visa");
        Card c3=new Card(12.3,"Amex");

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(c1);
        cards.add(c2);
        cards.add(c3);

        for(Card c:cards){
            c.printInfo();
        }
        Iterator<Card> cardIterator = cards.iterator();
        while(cardIterator.hasNext()){
           Card cardMethod=cardIterator.next();
            cardMethod.printInfo();
        }

    }
}
