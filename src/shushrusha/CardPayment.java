package shushrusha;

import java.util.Scanner;

public class CardPayment  {
    int  count=1, pass;


    public void cardPayment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your card number: ");
        int phone = input.nextInt();


        while (count == 1) {
            System.out.print("Enter your password: ");
            pass = input.nextInt();
            if(pass== 1234){
                System.out.print("Successfully paid.");
                System.out.println("Printing............");
                count++;
            }else
                System.out.print("Your password is wrong & try again ");

        }


    }
}