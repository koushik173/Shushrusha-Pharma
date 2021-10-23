package shushrusha;

import java.util.Scanner;

public class CardPayment {
    int number, count=1, pass;


    public void cardPayment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your card number: ");
        int number = input.nextInt();


        while (count == 1) {
            System.out.println("Enter your password: ");
            pass = input.nextInt();
            if(pass== 1236){
                System.out.println("Successfully paid.");
                count++;
            }else
                System.out.println("Your password is wrong & try again ");

        }


    }
}