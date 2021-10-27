
package shushrusha;

import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class CustomerData {
    FilePath fp = new FilePath();
    
    String no, name,date,address,path =fp.toFilePath();
    int phone, amount=0;
    
    Scanner input = new Scanner(System.in);
    public int createCustomerData(){
        try{
                 
                    System.out.print("Enter ID: ");
                    no = input.next();   
            Formatter formatter = new Formatter(path+"\\"+no+".txt");
                    
                    System.out.print("Enter Name: ");
                    name = input.next();
                    System.out.print("Enter phone: ");
                    phone = input.nextInt();
                    System.out.print("Enter Date: ");
                    date = input.next();
                    System.out.print("Enter Address: ");
                    address = input.next();
                    
                    formatter.format(" ");
                    formatter.format("                                                             Reciept\n ");
                    formatter.format("                                                         Shushrusha Pharma\n ");
                    formatter.format("                                                            123456789\n");
                    formatter.format("	                                             Sylhet Sadar, Sylhet-3100\n");
                    formatter.format("                                           No: %s                   Name: %s \n",no,name);
                    formatter.format("                                           Phone: %s               Date: %s \n",phone,date);
                    formatter.format("                                          Address: %s \n",address);
                    formatter.format("                               __________________________________________________________________________ \n");
                    formatter.format("                                 NO  |        Description      |  Quantity    |	 Rate     |      Amount \n");
                    formatter.format("                                __________________________________________________________________________");
                    
                    TotalMedicineList m = new TotalMedicineList();
                    m.totalMedicine();
                    int count=1,nn;
                    
                    System.out.print("Number of Medicines: ");
                    nn = input.nextInt();
                    while(nn>=count){
                        
                        System.out.print("Enter choice: ");
                        int  option = input.nextInt();
                        formatter.format(" \n                                 %s",count);
                        
                        
                        switch(option){
                            case 1001:
                                    System.out.print("Quantity: ");
                                    int q1 = input.nextInt();
                                    formatter.format("       ANZITOR  40mg                 %s           40/=           %s/=",q1,q1*40);
                                    amount += q1*40;
                                    count++;
                                    break;
                            case 1002:
                                    System.out.print("Quantity: ");
                                    int q2 = input.nextInt();
                                    formatter.format("       AZITHROMYCIN  5mg             %s           30/=           %s/=",q2,q2*30);
                                    amount += q2*30;
                                    count++;
                                    break;
                            case 1003:
                                    System.out.print("Quantity: ");
                                    int q3 = input.nextInt();
                                    formatter.format("       CALBO-D Vita  500mg           %s           40/=           %s/=",q3,q3*40);
                                    amount += q3*40;
                                    count++;
                                    break;
                            case 1004:
                                    System.out.print("Quantity: ");
                                    int q4 = input.nextInt();
                                    formatter.format("       E-CAP    200mg                %s           30/=           %s/=",q4,q4*30);
                                    amount += q4*30;
                                    count++;
                                    break;
                            case 1005:
                                    System.out.print("Quantity: ");
                                    int q5 = input.nextInt();
                                    formatter.format("       FEXOFENADINE  120mg           %s           40/=           %s/=",q5,q5*40);
                                    amount += q5*40;
                                    count++;
                                    break;
                            case 1006:
                                    System.out.print("Quantity: ");
                                    int q6 = input.nextInt();
                                    formatter.format("       MOTIGUT   10mg                %s            8/=           %s/=",q6,q6*8);
                                    amount += q6*8;
                                    count++;
                                    break;
                            case 1007:
                                    System.out.print("Quantity: ");
                                    int q = input.nextInt();
                                    formatter.format("       NAPA EXTRA  500mg             %s           10/=           %s/=",q,q*10);
                                    amount += q*10;
                                    count++;
                                    break;
                            case 1008:
                                    System.out.print("Quantity: ");
                                    int q8 = input.nextInt();
                                    formatter.format("       NEURO – B 500mg               %s           20/=           %s/=",q8,q8*20);
                                    amount += q8*20;
                                    count++;
                                    break;
                            case 1009:
                                    System.out.print("Quantity: ");
                                    int q9 = input.nextInt();
                                    formatter.format("       NIDOCARD RETARD  2.5mg        %s           20/=           %s/=",q9,q9*20);
                                    amount += q9*20;
                                    count++;
                                    break;
                            case 1010:
                                    System.out.print("Quantity: ");
                                    int q10 = input.nextInt();
                                    formatter.format("     OSARTIL  50mg                  %s            10/=           %s/=",q10,q10*10);
                                    amount += q10*10;
                                    count++;
                                    break;
                            case 1011:
                                    System.out.print("Quantity: ");
                                    int q11 = input.nextInt();
                                    formatter.format("     PANTONIX   20mg                %s             8/=           %s/=",q11,q11*8);
                                    amount += q11*8;
                                    count++;
                                    break;        
                        }  
                    }
                    formatter.format("\n\n\n                                                                                           Total: %s/=\n",amount);
                    formatter.format("                              -----------------------------------------------------------------------------------\n");
                    formatter.format("                                 Goods can be exchange within 7 days.\n");
                    formatter.format("                                 Stay Well, Stay Hydrated.\n");
                    formatter.close();
                    System.out.println("Total amount: "+amount+"/=");
                    System.out.println("\n -->$ Please Payment.");
                }
        catch(IOException e){
                  System.out.println(e);
                          }
    return amount;
    }
}
