package biggersmaller;

import java.util.Scanner;

public class Biggersmaller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program can give you the biggest and smallest number of three");
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();

        System.out.println("Write another number");
        int variable_2 = scanner.nextInt();

        System.out.println("Write the third number");
        int variable_3 = scanner.nextInt();
        int small;
        int big;
        
        if (variable_1 > variable_2 && variable_1 > variable_3) {
            big = variable_1;
            if (variable_2 > variable_3) {

                small = variable_3;
            } else {

                small = variable_3;
            }
            System.out.println("The biggest number is: " + big + " and The smallest number is: " + small);
        }

        if (variable_2 > variable_1 && variable_2 > variable_3) {
            big = variable_2;
            if (variable_1 > variable_3) {

                small = variable_3;
            } else {
                
                small = variable_1;
            }
            System.out.println("The biggest number is: " + big + " and The smallest number is: " + small);

        }

        if (variable_3 > variable_1 && variable_3 > variable_2) {
            big = variable_3;
            if (variable_2 > variable_1) {

                small = variable_1;
            } else {

                small = variable_2;
            }

            System.out.println("The biggest number is: " + big + " and The smallest number is: " + small);

        }

    }
}

