package shushrusha;

import java.util.Scanner;
public class Bkash {

    int number, otp,count=1;
    String pass;

    public void bkashPayment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your phn number: ");
        number = input.nextInt();
        System.out.print("Enter your password: ");
        pass = input.nextLine();

        while (count == 1) {
            System.out.print("OTP: ");
            otp = input.nextInt();
            if(otp== 123456){
                System.out.println("Successfully Paid.");
                count++;
            }else{
                System.out.println("Your OTP is wrong");
                System.out.println("Try again");
            }
        }
    }
}
