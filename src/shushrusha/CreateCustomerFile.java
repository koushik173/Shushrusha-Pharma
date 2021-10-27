
package shushrusha;

import java.io.IOException;
import java.util.Scanner;

public class CreateCustomerFile {
    
    FilePath fp = new FilePath();
    String filename1,path= fp.toFilePath();
    
    public void CreateFile() { 
    
    Scanner fileName = new Scanner(System.in);
                System.out.print("Customer ID No: ");
                 filename1 = fileName.next();
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
