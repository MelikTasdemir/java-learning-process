package day10;

import java.io.IOException;
import java.nio.file.Path;
import  java.util.Scanner;

public class ReadFilesScanner {
    public static void main(String[] args) throws IOException {

Scanner scan = new Scanner(Path.of("src/day10/Test.txt"));

     /*   System.out.println( scan.nextLine() );
        System.out.println( scan.nextLine() );
        System.out.println( scan.nextLine() );
*/
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());


    }

}
