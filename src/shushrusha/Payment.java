package shushrusha;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Payment {
    int  amount1,option;
    String no;
Scanner input = new Scanner(System.in);


    public void totalPayment(int t) throws FileNotFoundException, IOException {
        System.out.print("Enter ID: ");
                    no = input.next(); 
        FileReader fr = new FileReader("K:\\Java\\ Shushrusha_Pharma\\Customer\\"+no+".txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
       
        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
        
        amount1 = t;
        System.out.println("1: Cash");
        System.out.println("2: Bkash");
        System.out.println("3: Credit Card");
        System.out.print("Choose your option: ");

        option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Successfully Paid.");
                break;
                
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
