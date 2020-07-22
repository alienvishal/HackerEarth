/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
imports for BufferedReader
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
//import java.util.*;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class Pallindrome {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        */
 
        // Write your code here
        String str = br.readLine();
        char strtoArray[] = str.toCharArray();
        int length = str.length();
        int mid = length / 2;
        int j,i;
        boolean isPallindrome = true;
        
        for(i = 0, j = length - 1; i < mid; i++, j--){
            isPallindrome = true;
            
            if(strtoArray[i] != strtoArray[j]){
                isPallindrome = false;
                break;
            }
        }
        if(isPallindrome){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}