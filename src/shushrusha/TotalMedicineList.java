
package shushrusha;

import java.io.FileReader;
import java.io.IOException;

public class TotalMedicineList {
   
    public void totalMedicine() throws IOException{
        FileReader fr = new FileReader("K:\\Java\\ Shushrusha_Pharma\\Medicines.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
    }
}
