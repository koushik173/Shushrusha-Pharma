
package shushrusha;

import java.io.IOException;
import java.util.Scanner;

public class Run {
    

    public static void main(String[] args) throws IOException{
       
        Display display=new Display();
                display.display();
        
   
       int count =1;
     
     while(count==1){
         Option op = new Option();
         op.option();
    
    
        Scanner myObj = new Scanner(System.in);
        System.out.print("                                               Enter choice: ");
        int  option = myObj.nextInt();
      
      switch(option){
                
                
            case 1:    
                CreateCustomerFile cf = new CreateCustomerFile();
                cf.CreateFile();
                break;
                
            case 2:
                CustomerData cd = new CustomerData();
                cd.createCustomerData();
                
            case 3:

                 Payment p =new Payment();
                 p.totalPayment();
            case 4:
                 System.out.println("Delivary");
                 
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

