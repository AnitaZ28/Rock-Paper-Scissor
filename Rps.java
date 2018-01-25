/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anita
 * 
 */

public class Rps {
/**
 * Displays(prints) an opening message for the Rock-Paper-Scissors Game. Rock is
 * 0, Rock is 1, and Paper is 2
 */
    public static void displayOpeningMessage(){
        System.out.println("We would play a game of Rock Paper Scissor. Rock "
                + "is 0, Rock is 1, and Paper 2");
    }
    
    public static int getUserMove(Scanner in){
        
       int readNum = -1;
        do{
            System.out.println("Enter a number between 0 and 2:");
            
            if(in.hasNextInt()){
                readNum=in.nextInt();
            } else{
                System.out.println("A number was not given");
                in.next();
                
            }
        }while(readNum<0 || readNum>2); 
        return readNum;
    }
    
    public static int getCPUMove(){
        int computer=0;
      //Declares and initializes a Random Object
        Random rnd = new Random();
        //Generates a number between 0 and 2
        computer = rnd.nextInt(3);

        if(computer==0)
            System.out.println("Computer is scissor");
            if (computer==1)
                System.out.println("Computer is rock");
            if(computer==2)
                System.out.println("Computer is paper");  
        
        return computer;
    }   
    
    
public static void determineWinner(int user, int computer){
   if (user == 0 && computer == 0)
        System.out.println("Game is a draw");
      else if (user ==1 && computer == 1)
        System.out.println("Game is a draw");
      else if( user == 2 && computer ==2)
        System.out.println("Game is a draw");
      if (user==2 && computer ==0)
        System.out.println("Computer wins");
      else if(user==1 && computer ==2)
        System.out.println("Computer wins");
      else if(user==0 && computer == 1 )
        System.out.println("Computer wins");
      if(user==2 && computer==1)
        System.out.println("You win");
      else if(user==1 && computer == 0)
        System.out.println("You win");
      else if(user==0 && computer==2)
       System.out.println("You win");
}   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in); 
        int user=0;
        int cpu=0;
        
        displayOpeningMessage();
        user= getUserMove(input);
        cpu = getCPUMove();
        determineWinner(user, cpu);
       
//        determineWinner(getUserMove(input), getCPUMove());
      
    }
} 
  
  
  
  
 
      
  
  
      
   
   
