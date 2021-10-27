
package shushrusha;

import java.io.FileReader;
import java.io.IOException;

public class TotalMedicineList {
   FilePath fp = new FilePath();
   String path= fp.toFilePath();
    public void totalMedicine() throws IOException{
        FileReader fr = new FileReader(path+"\\Medicines.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
    }
}
