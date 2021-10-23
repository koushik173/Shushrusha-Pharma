package shushrusha;

import java.util.Scanner;

public class Payment {

    public void totalPayment() {
        int  amount,option;
        Scanner input = new Scanner(System.in);

        System.out.print("Total amount is: ");
        Scanner input1 = new Scanner(System.in);
        amount = input1.nextInt();


        System.out.println("1:Cash received ");
        System.out.println("2: Bkash");
        System.out.println("3: Credit Card");

        System.out.println("choose your option: ");
        Scanner input2 = new Scanner(System.in);

        option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Received");


            case 2:
                Bkash b = new Bkash();
                b.bkashPayment();

                break;

            case 3:
                CardPayment cc = new CardPayment();
                cc.cardPayment();
                break;

        }
    }
}
