/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
//import java.util.*;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class Anagram {
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
        int t = Integer.parseInt(br.readLine());
        for(int test=0;test<t;test++)
        {
            String str1 = br.readLine();
            String str2 = br.readLine();
            
            char[] str1toarray = str1.toCharArray();
            char[] str2toarray = str2.toCharArray();
            
            int length1 = str1.length();
            int length2 = str2.length();
            int i,j,count=0;
            for(i = 0; i < length1; i++){
                
                for(j = 0; j < length2; j++){
                    
                    if(str1toarray[i] == str2toarray[j]){
                        str2toarray[j] = '0';
                        count++;
                        break;
                    }
                }
            }
            
            int number_of_deletion = (length1 - count) + (length2 - count);
            System.out.println(number_of_deletion);
        }
 
    }
}