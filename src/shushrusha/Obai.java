
package shushrusha;

import java.util.Scanner;

public class Obai extends Delivery {
     Scanner input = new Scanner(System.in);
    public void toObai() {
       
        System.out.print("                           Enter your name: ");
        super.name = input.nextLine();
        
        System.out.print("                           Enter your location: ");
        super.location = input.nextLine();
        
        System.out.print("                           Enter your phone number: ");
        super.phone = input.nextInt();
        
        System.out.println(" Delivery done");

}
}
