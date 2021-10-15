package com.company;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_num = rand.nextInt(3);
        System.out.print("Enter player name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("** Rock Paper Scissors Game **");
        System.out.println("* Enter 0 for Rock *");
        System.out.println("* Enter 1 for Paper *");
        System.out.println("* Enter 2 for Scissors *");
        System.out.print("Give your input : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if((num==0 && rand_num==2) || (num==1 && rand_num==0) || (num==2 && rand_num==1)){
            System.out.println("Congratulations! "+name+" You Won");
        }
        else if((num==2 && rand_num==0) || (num==0 && rand_num==1) || (num==1 && rand_num==2)){
            System.out.println("Computer Won");
        }
        else if((num==0 && rand_num==0) || (num==1 && rand_num==1) || (num==2 && rand_num==2)){
            System.out.println("Match Tied");
        }
        else {
            System.out.println("Invalid input given by player. Please give correct input.");
        }
        System.out.println("Input given by computer : " +rand_num);
        System.out.println("Thank you for playing Rock Paper Scissors.");
    }
}
