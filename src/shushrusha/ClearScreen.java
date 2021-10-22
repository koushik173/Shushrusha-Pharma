
package shushrusha;

import java.io.IOException;

public class ClearScreen{
    public static void main(String[] args) {
        System.out.println("hi");   
        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine(); 
        // TODO Auto-generated method stub
        clear();
        System.out.println("Screen out has been flushed");
    }

    public static void clear()
    {
        try
        {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
