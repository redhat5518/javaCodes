
package crapstest;

import java.util.Random;


public class Craps {

    Random randomNumbers=new Random();
    private enum status{WON,LOSS,CONTINUE};
    
    private final static int SNAKE_EYES=2;
    private final static int TRAY=3;
    private final static int SAVEN=7;
    private final static int YO_LEVEN=11;
    private final static int BOX_CARS=12;
    
    public void play(){
    
    int myPoint=0;
    status gameStatus;
    int sumOfDice=RollDice();
    
    switch(sumOfDice){
        case SAVEN :
        case YO_LEVEN :
            gameStatus=status.WON;
            break;
            
        case TRAY:
        case SNAKE_EYES :
        case BOX_CARS :
            gameStatus=status.LOSS;
            break;
            
            
        default :
            gameStatus=status.CONTINUE;
            myPoint=sumOfDice;
            System.out.println("My points are \t"+myPoint);
            break;
                    
    
    }
    
    while(gameStatus==status.CONTINUE){
        sumOfDice=RollDice();
        
        if(sumOfDice==myPoint)
        {
        gameStatus=status.WON;
        
        }
        else if(sumOfDice==SAVEN){
            gameStatus=status.LOSS;
    }
        
    }
        if(gameStatus==status.WON)
            System.out.println("player wins");
        else
            System.out.println("player losses");
    
    
    
    
    }
    
    public int RollDice(){
        int number1=1+randomNumbers.nextInt(6);
        int number2=1+randomNumbers.nextInt(6);
        
        int sum=number1+number2;
    System.out.println("Sum of two dices is\t:"+sum);
    
    return sum;
    }
}
