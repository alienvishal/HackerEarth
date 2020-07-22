/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.*;
import java.util.Arrays;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TwoString {
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        String str;
        for(int i = 0; i < testcase; i++){
            
            str = br.readLine();
            
            String[] words = str.split(" ");
            
            char[] str2_to_char = words[0].toCharArray();
            char[] str1_to_char = words[1].toCharArray();
            
            if(words[0].length() == words[1].length())
            {
                Arrays.sort(str1_to_char);
                Arrays.sort(str2_to_char);
                String sortedString1 = new String(str1_to_char);
                String sortedString2 = new String(str2_to_char);
                
                if(sortedString1.equals(sortedString2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
            
        }   
    }
}