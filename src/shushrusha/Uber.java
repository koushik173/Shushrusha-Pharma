
package shushrusha;

import java.util.Scanner;

public class Uber extends Delivery {
   Scanner input = new Scanner(System.in);
    public void toUber() {
       
        System.out.print("                           Enter your name: ");
        super.name = input.nextLine();
        
        System.out.print("                           Enter your location: ");
        super.location = input.nextLine();
        
        System.out.print("                           Enter your phone number: ");
        super.phone = input.nextInt();
        
        System.out.println(" Delivery Processing");
}
}
