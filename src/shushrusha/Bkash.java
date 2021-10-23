package shushrusha;

import java.util.Scanner;
public class Bkash {

    int number, otp,count=1;
    String pass;

    public void bkashPayment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your phn number: ");
        int number = input.nextInt();
        System.out.println("Enter your password: ");
        String pass = input.nextLine();

        while (count == 1) {
            System.out.println("OTP: ");
            int otp = input.nextInt();
            if(otp== 442266){
                System.out.println("Successfully paid.");
                count++;
            }else{
                System.out.println("Your OTP is wrong");
                System.out.println("Try again");
            }


        }
    }
}
