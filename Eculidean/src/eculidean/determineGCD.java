
package eculidean;


import java.util.Scanner;


public class determineGCD {
    
    public  void calculateGCD(){
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number for which gcd is calculated");
       int r1=scan.nextInt();
        System.out.println("Enter the number for which gcd is calculated");
      int  r2=scan.nextInt();
      
   
     
        while(r2!=0){
           
        
        double q=r1/r2;
       double r=r1-r2*q;
        r1=r2;
        r2=(int)r;
        
        }
        
        System.out.println(r1);
        
    }
    
}
