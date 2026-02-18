package org.example;

import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {
        AtmOperation atmoperation=new AtmOperation();
         String  pin = "1234";
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the pin");
        String pincode =scanner.nextLine();
        if (pincode.equals(pin)) {
            while (true) {
                System.out.println("the atm is provide below operation");
                System.out.println("1 balance check\n2 deposit\n3 Withdraw\n4 break");
                System.out.println("enter the operation");
                String operation = scanner.nextLine();
                if (operation.contains("1")) {
                    atmoperation.viewbalance();

                } else if (operation.contains("2")) {
                    System.out.println("Enter the amount deposit");
                    Double amount = scanner.nextDouble();
                    atmoperation.Deposit(amount);
                } else if (operation.contains("3")) {
                    System.out.println("enter the number of withdraw");
                    Double amount = scanner.nextDouble();
                    atmoperation.withdraw(amount);
                }
            }

            }
        else{
            System.out.println("wrong pin try again");
        }


    }
}
