
package shushrusha;

import java.io.IOException;
import java.util.Scanner;

public class CreateCustomerFile extends FileCreation{
    String filename1;
    @Override
    public void CreateFile() { 
    Scanner fileName = new Scanner(System.in);
                System.out.print("Customer Name: ");
                 filename1 = fileName.nextLine();
                 java.io.File   file1          = new java.io.File(path,filename1+".txt");
                try{
                    if (file1.createNewFile()) {
                     System.out.println("File created: " + file1.getName());
                     } 
                    else {
                             System.out.println("File already exists.");
                         }
                }
                catch(IOException e){
                  System.out.println(e);
                            }
}
    
}
