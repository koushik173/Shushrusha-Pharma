
package shushrusha;

import java. util.Scanner;
public class Delivery {
     String name, location;
      int phone;
    public void toDelivery(){
        int count = 1;
        while (count == 1){
            System.out.println(" 1-->  Pathao");
            System.out.println(" 2-->  Uber");
            System.out.println(" 3-->  Obai");
            Scanner myObj = new Scanner(System.in);
            System.out.print("                                               Enter option: ");
            int  option = myObj.nextInt();

            switch (option){
                case 1:

                    Pathao p = new Pathao();
                    p.toPathao();
                    count++;

                    break;
                case 2:

                    Uber u = new Uber();
                    u.toUber();
                    count++;

                    break;
                case 3:

                    Obai o = new Obai();
                    o.toObai();
                    count++;

                    break;

            }


        }
    }
}

