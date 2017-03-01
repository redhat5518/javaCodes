
package dackofcard;


public class Cards {
public static enum  Face {Ace,Deuce,Three,Four,Five,Six,Saven,Eight,Nine,Ten,Jack,Queen,King};
public static enum Suits{Club,Diamonds,Hearts,Spades};
 private final Face face;
 private final Suits suit;
 
 public Cards(Face cardFace,Suits cardSuit){
 face=cardFace;
 suit=cardSuit;
 }

    public Face getFace() {
        return face;
    }

    public Suits getSuit() {
        return suit;
    }
   public String toString(){
   return String.format("%s of %s",face,suit);
   }
}
