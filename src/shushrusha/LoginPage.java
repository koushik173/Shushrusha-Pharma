package shushrusha;
import java.util.Scanner;
public class LoginPage {

    int pass = 1234;
    int count = 1;

    public void login() {
        System.out.print("\t\t\t\t\t  _________________________________________________________________________________________\n");
        System.out.print("\t\t\t\t\t|                                           		                                   |\n");
        System.out.print("\t\t\t\t\t|                                           		                                   |\n");
        System.out.print("\t\t\t\t\t|                                      Login                  		                   |\n");
        System.out.print("\t\t\t\t\t|                                           		                                   |\n");
        System.out.print("\t\t\t\t\t|                                           		                                   |\n");
        System.out.print("\t\t\t\t\t|__________________________________________________________________________________________|\n");
        while (count == 1) {
            Scanner sc = new Scanner(System.in);


            System.out.print("                                         Enter the Password:");
            pass = sc.nextInt();
            if (pass == 1234) {
                System.out.println("                                               Successfully Access             ");
                count++;
            } else {
                System.out.println("                                        Wrong password. Please try again");
            }
        }
    }
}

