
package multiplicationteacher;

import java.util.Random;
import java.util.Scanner;


public class QuestionAsker {
    int number1;
    int number2;
    int result;
    int theAnswer;
    int correct=0;
    int incorrect=0;
    int counter;
    Scanner answer=new Scanner(System.in); 
    Random rands1= new Random();
    public void Asker(){
    
    number1=rands1.nextInt(9);
    number2= rands1.nextInt(9);
    
    System.out.printf("HOW MUCH IS  %s timnes %s", number1,number2);
    
    System.out.println("Enter your answer");
     theAnswer=answer.nextInt();
    
    result=number1*number2;
    checkAnswer();
    
    }
    public void checkAnswer(){
        
        for(counter=0;counter<10;counter++){
            
        if(theAnswer==result){
            
            System.out.println("Very Good you did well !");
            System.out.println("Lets try another ONe");
            ++correct;
            Asker();
        }
        else{
            System.out.println("Wrong Answer !,Try again you fool");
            System.out.println("HOW MUCH IS" + number1+ "timnes"+number2);
            System.out.println("Enter your answer");
                theAnswer=answer.nextInt();
                 result=number1*number2;
                 ++incorrect;
               checkAnswer();
               
        }
        System.out.println("here we going");
        
                
        
        }
        displayreportCard();
    }
        
        public void displayreportCard(){
            System.out.printf("Correct answers are",correct);
            System.out.printf("Incorrect answers are",incorrect);
            int percentage=(counter/correct)*100;
            if (percentage<=60)
                System.out.println("You need to more Practicess and attend class more");
            else 
                System.out.println("Good performance");
            
            System.out.println("Next Student please");
            Asker();
            
            
        
        }
        
    
}
