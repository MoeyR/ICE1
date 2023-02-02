package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue((int)(Math.random()*13+1));
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i]=card;

            //System.out.println(hand[i].getValue() + " & " + hand[i].getSuit());
            //System.out.println(card.getValue() + " & " + card.getSuit());
        }
            
        Scanner input = new Scanner(System.in);
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        System.out.print("Please enter card value (1-13): ");
        int cardValue = input.nextInt();
        System.out.print("Please enter card suit (1-4): ");
        int cardSuit = input.nextInt();
		
        Card userCard = new Card();
        userCard.setValue(cardValue);
        userCard.setSuit(Card.SUITS[cardSuit-1]);	
        
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        for (int i = 0; i < hand.length; i++) {
            // If the guess is successful, invoke the printInfo() method below.
            if(userCard.getValue() == hand[i].getValue() || userCard.getSuit() == hand[i].getSuit()){
                printInfo();
                break;
            }
            System.out.println("Sorry! You guessed wrong.");
            break;
        }
        //System.out.println(userCard.getValue() + " & " + userCard.getSuit());
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Moyu, but you can call me by my English name Moey!");
        System.out.println();
        
        System.out.println("My study ambitions:");
        System.out.println("-- Be more diligent on coding, and stay hungry!")
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Coding");
        System.out.println("-- Financing");
        System.out.println("-- Reading and Workout");
        System.out.println("-- Walking my dog");

        System.out.println();
        
    
    }

}
