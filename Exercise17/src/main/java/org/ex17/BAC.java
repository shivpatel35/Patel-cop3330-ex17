package org.ex17;

import java.util.Scanner;

public class BAC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double BAC = 0;

        System.out.print("What is your weight? ");
        int weight = scanner.nextInt();
        System.out.print("What is your gender? ");
        String gender = scanner2.nextLine();
        System.out.print("What is your total alcohol consumption in oz?");
        float tac = scanner.nextInt();
        System.out.print("How many hours has it been since you had your last drink?");
        float hours = scanner.nextInt();

        if(gender.equals("M")){
             BAC = ((tac * 5.14) / (weight * 0.73) -.015) * hours;
             System.out.print("Your BAC is " + BAC);
             String message = (BAC < 0.08)? "\nIt is illegal for you to drive.":
                                            "\nIt is legal for you to drive.";
             System.out.print(message);
        }
        else if (gender.equals("W")){
             System.out.print("Your BAC is " + BAC);
             BAC = ((tac * 5.14) / (weight * 0.66) -.015) * hours;
            String message = (BAC < 0.08)? "\nIt is illegal for you to drive.":
                                           "\nIt is legal for you to drive.";
            System.out.print(message);
        }

        }

        }

