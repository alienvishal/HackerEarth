/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int seat;
        int remainder, i;
        int number_of_seat = sc.nextInt();
        for(i = 0; i < number_of_seat; i++){
            seat = sc.nextInt();
            remainder = seat % 12;
            
            switch(remainder){
                case 1: 
                    seat = seat + 11;
                    System.out.println(seat+" "+"WS");
                    break;
                case 2:
                    seat = seat + 9;
                    System.out.println(seat+" "+"MS");
                    break;
                case 3:
                    seat = seat + 7;
                    System.out.println(seat+" "+"AS");
                    break;
                case 4:
                    seat = seat + 5;
                    System.out.println(seat+" "+"AS");
                    break;
                case 5:
                    seat = seat + 3;
                    System.out.println(seat+" "+"MS");
                    break;
                case 6:
                    seat = seat + 1;
                    System.out.println(seat+" "+"WS");
                    break;
                case 7:
                    seat = seat - 1;
                    System.out.println(seat+" "+"WS");
                    break;
                case 8:
                    seat = seat - 3;
                    System.out.println(seat+" "+"MS");
                    break;
                case 9:
                    seat = seat - 5;
                    System.out.println(seat+" "+"AS");
                    break;
                case 10:
                    seat = seat - 7;
                    System.out.println(seat+" "+"AS");
                    break;
                case 11:
                    seat = seat - 9;
                    System.out.println(seat+" "+"MS");
                    break;
                case 0:
                    seat = seat - 11;
                    System.out.println(seat+" "+"WS");
                    break;    
                    
            }
        }
    }
}
