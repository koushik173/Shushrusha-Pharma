
package shushrusha;

import java.util.Scanner;

public class Pathao extends Delivery {
     Scanner input = new Scanner(System.in);
    public void toPathao() {
 
       System.out.print("                           Enter your name: ");
        super.name = input.nextLine();
        
        System.out.print("                           Enter your location: ");
        super.location = input.nextLine();
        
        System.out.print("                           Enter your phone number: ");
        super.phone = input.nextInt();
        
        System.out.println(" Delivery Processing");
}
}
