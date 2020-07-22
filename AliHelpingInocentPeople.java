/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class AliHelpingInocentPeople {
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
        int num1, num2, sum, valid = 0, i, j;
        String tag = br.readLine();
        for(j = 0; j < tag.length(); j++){
            
            if( j >= tag.length() - 1 ){
                break;
            }
            
            if(Character.isDigit(tag.charAt(j))){
                if(Character.isDigit(tag.charAt(j+1))){
                    num1 = tag.charAt(j) - 48;
                    num2 = tag.charAt(j+1) - 48;
                    sum =  num1 + num2;
                        
                    if(sum % 2 == 0){
                        valid = 1;
                    }
                    else{
                        valid = 0;
                        break;
                    }
                }
            }
                
            if(tag.charAt(j) != 'A' || tag.charAt(j) != 'E' || tag.charAt(j) != 'I' || tag.charAt(j) != 'O' || tag.charAt(j) != 'U' || tag.charAt(j) != 'Y' ) {
                valid = 1;
            }
            
            if(tag.charAt(j) == 'A' || tag.charAt(j) == 'E' || tag.charAt(j) == 'I' || tag.charAt(j) == 'O' || tag.charAt(j) == 'U' || tag.charAt(j) == 'Y' ){
                valid = 0;
                break;
            }
        }
        if(valid == 1){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}