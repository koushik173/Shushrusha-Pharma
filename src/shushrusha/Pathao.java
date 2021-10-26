
package shushrusha;

import java.util.Scanner;

public class Pathao {
     Scanner input = new Scanner(System.in);
    public void toPathao() {
        String name, location;
        int ph;
       
        System.out.print("                           Enter your name: ");
        name = input.nextLine();
        
        System.out.print("                           Enter your location: ");
        location = input.nextLine();
        
        System.out.print("                           Enter your phone number: ");
        ph = input.nextInt();
        
        System.out.println(" Delivery done");
}
}
