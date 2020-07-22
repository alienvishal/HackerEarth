/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes*/
 
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class RoyAndProfilePicture {
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
        int minimum_dimension = sc.nextInt();
        int number_of_photos = sc.nextInt();
        int dimension[][] = new int[number_of_photos][2];
        int i,j;
        for(i = 0; i < number_of_photos; i++){
            for(j = 0; j < 2; j++){
                dimension[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < number_of_photos; i++){
               
            if(dimension[i][0] < minimum_dimension || dimension[i][1] < minimum_dimension ){
                 System.out.println("UPLOAD ANOTHER");
            }
            
            if(dimension[i][0] >= minimum_dimension && dimension[i][1] >= minimum_dimension ){
                
                if(dimension[i][0] == dimension[i][1]){
                    System.out.println("ACCEPTED");
                }
                else{
                    System.out.println("CROP IT");
                }
            }
        }
        
    }
}