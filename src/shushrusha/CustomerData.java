
package shushrusha;

import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class CustomerData {
    String id, name, phone;
    public void createCustomerData(){
        try{
                    Formatter formatter = new Formatter("K:/Java/ Shushrusha_Pharma/Customer/koushik.txt");
                    
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.print("Enter id: ");
                    id = input.next();
                    System.out.print("Enter phone: ");
                    phone = input.next();
                    formatter.format(" ");
                    formatter.format("%s\n %s\n %s\r\n",name,id,phone);
                    
                    formatter.close();
                }catch(IOException e){
                  System.out.println(e);
                          }
    }
}
