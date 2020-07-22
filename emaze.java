/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class emaze {
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
        int X = 0, Y = 0;
        String command = sc.nextLine();
        int length = command.length();
        
        for(int i = 0; i < length; i++){
            if(command.charAt(i) == 'L'){
                X--;
            }
            else if(command.charAt(i) == 'R'){
                X++;
            }
            else if(command.charAt(i) == 'D'){
                Y--;
            }
            else if(command.charAt(i) == 'U'){
                Y++;
            }
        }
        System.out.println(X+" "+Y);
 
    }
}
Language: Java 8