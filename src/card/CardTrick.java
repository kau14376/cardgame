/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Taranjot kaur
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3+0)]);
            magicHand[i]=c;
            System.out.println(magicHand[i].getSuit()+" "+magicHand[i].getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the card value (2-10, J, Q, K, A): ");
        String value = scanner.nextLine();

        System.out.print("Enter the card suit (hearts, diamonds, clubs, spades): ");
        String suit = scanner.nextLine();

        String card = value + " of " + suit;

        System.out.println("Your card is: " + card);
        // and search magicHand here
        boolean matchFound = false;
                matchFound = true;
         // Display the result
        if (matchFound) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
    
    }
}
    
    

