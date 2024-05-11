import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String args[]){
        System.out.println(" WELCOME TO NUMBER GAME \n\n Instruction: our system randomly fix a number(range 1 to 100)\n\n We provoide three attempts to you to guess the number.\n\nAccording to your attempt Scores will be provoided.");
        int i;
        Random random =new Random();
        int n =random.nextInt(100);
        for(i =1;i <=3;i++){
        System.out.println(" \n Attempted  " + i);
        Scanner sc = new Scanner(System.in);
        System.out.println("Your guess : ");
        int user = sc.nextInt();
        if(user == n){
            System.out.println("\n\n  Congrats You Won...");
            break;
        }
        else if(user > n){
            int diff = user - n;
            if(diff <= 10){
                System.out.println("\n Well Done!! You are close to the guess ");
            }
            else{
                System.out.println("\n Oops..You are away from guess..");
            }
        }
        else{
            int diff =n- user;
            if(diff <= 10){
                System.out.println("\n Well Done!! You are close to the guess ");
            }
            else{
                System.out.println("\n  Oops..You are far away from guess.. ");
            }
        }
    }
    int score;
    switch(i){
        case 1:
           score = 100;
           System.out.println("\nScore = "+ score);
           break;
        case 2:
            score =80;
            System.out.println("\nScore = "+ score);
            break;
        case 3:
            score =60;
            System.out.println("\nScore = "+ score);
            break;
        default:
            System.out.println("Your Attempt are overed...");
            System.out.println("\n You Loss the Game.");
    }

    } 
}
