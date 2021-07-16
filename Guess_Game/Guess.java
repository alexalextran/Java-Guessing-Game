package Guess_Game;
import java.util.Scanner;
public class Guess {

    public static void main(String[] args){
        int computerNumber = (int) (Math.random()*100 + 1);
        int guesses = 0;
        Scanner sc = new Scanner(System.in);
        boolean correct = true;
        
     
         System.out.println("Hello welcome to the guessing game by alex");
         System.out.println(" ");
         System.out.println(" ");
         System.out.println(" ");

         System.out.println("I am thinking of a number between 1 and 100");

        do{
        System.out.print("Enter in a number: ");
        int userinput = sc.nextInt();
        guesses++;
        
          
          if (userinput > computerNumber){
              System.out.println("Lower!");
          } 
          else if (userinput < computerNumber){
              System.out.println("Higher!");
          }
          else if(userinput == computerNumber){
              System.out.println("That is my number!");
              System.out.println("");
              System.out.println("It took " + String.valueOf(guesses) + " tries" + " to win!" );
              correct = false;
              sc.close();
          }
         } while (correct == true);
         
     }
 

}
