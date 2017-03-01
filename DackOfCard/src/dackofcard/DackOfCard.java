
package dackofcard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class DackOfCard {
    private List<Cards> list;
    
    public DackOfCard(){
    Cards[] deck=new Cards[52];
    int count=0;
    
    for(Cards.Suits suit:Cards.Suits.values()){
        for(Cards.Face face:Cards.Face.values()){
        deck[count]=new Cards(face,suit);
        count++;
        }
    }
    list=Arrays.asList(deck);
    Collections.shuffle(list);
    }
    public void printCard(){
    for(int i=0;i<list.size();i++){
    System.out.printf("%-20s%s",list.get(i),((i+1)%2==0)?"\n":"\n");
    }
    }
    public static void main(String[] args) {
        DackOfCard obj=new DackOfCard();
        obj.printCard();
        // TODO code application logic here
    }
    
}
