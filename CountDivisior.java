/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader*/
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class CountDivisior {
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
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        
        for(int i = l; i <= r; i++){
            if(i % k == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}