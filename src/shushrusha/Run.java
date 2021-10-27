
package shushrusha;

import java.io.IOException;
import java.util.Scanner;

public class Run {
    
    public static void main(String[] args) throws IOException{

        LoginPage log = new LoginPage();
        log.login();
        
        Display display=new Display();
        display.display();
        Scanner myObj = new Scanner(System.in);
        
        
     int count =1,total = 0;
     while(count==1){
         Option op = new Option();
         op.option();

        System.out.print("                                               Enter choice: ");
        int  option = myObj.nextInt();
      
      switch(option){
    
            case 1:    
                CreateCustomerFile cf = new CreateCustomerFile();
                cf.CreateFile();
                break;
            case 2:
                CustomerData cd = new CustomerData();
                total = cd.createCustomerData();
                break;
            case 3:
                 Payment p =new Payment();
                 p.totalPayment(total);
                 break;
            case 4:
                 Delivery d = new Delivery();
                   d.toDelivery();

                 break;
            case 5:
                 TotalMedicineList tml = new TotalMedicineList();
                 tml.totalMedicine();
                 break;
            case 6:
                Exit exit = new Exit();
                exit.exit();
                count++;
                break;
                         
        }
        }
 
    }
}

