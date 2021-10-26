
package shushrusha;

import java.io.*;
import java.time.format.DateTimeFormatter;

    public class Simplex {

        private static PrintWriter outFile;

        //Main Method
        public static void main(String[] args) throws IOException {
            DateTimeFormatter timeStampPattern = DateTimeFormatter.ofPattern(" HH mm dd MM yyyy");
        System.out.println(timeStampPattern.format(java.time.LocalDateTime.now()));


}
    }