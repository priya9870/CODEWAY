/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int min= 1, max=100, k=4;
        System.out.println("Welcome to the Number Guessing Game!");
        int i, guess , score=0;
        while(true){
        int num=(int)(Math.random()*(max-min+1) + min);
        for(i=1;i<=k;i++){
            System.out.println("Attempt"+ i + " Guess the number between 1 to 100:");
              guess=sc.nextInt();
            if(guess==num){
                System.out.println("Congratulations! You guessed the correct number");
                score++;
                break;
            }
            else if(guess<num){
                System.out.println("Too low! Try again.");
            }
            else if(guess>num){
                System.out.println("Too high! Try again.");
            }
        if (i==k){
            System.out.println("Sorry, You have run out of attempts. The Correct number was:" + num);
        }
        }
        System.out.println("Do you want to play again? (Yes/No):");
            String multiple=sc.next();
            
        if(!multiple.equalsIgnoreCase("Yes")){
        System.out.println("Game Over! \n Your Final Score is " + score);
           break;
        }
        }
    }
    }
    