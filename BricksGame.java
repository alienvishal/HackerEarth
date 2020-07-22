/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes */
import java.util.*;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class BricksGame {
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
		int number_of_bricks = sc.nextInt();
		int i, chances = 0;
	    
	    for(i=1;i<=number_of_bricks;i++){
	        if(number_of_bricks == 1){
	            number_of_bricks = number_of_bricks - i;
	            chances = 0;
	        }
	        if(number_of_bricks > i){
	            number_of_bricks = number_of_bricks - i;
	            chances = 0;
	        }     
	       
	       if(number_of_bricks > 2*i){
	            number_of_bricks = number_of_bricks - (2*i);
	            chances = 1;
	        }
	    }
	    int j = 0;
	    while(number_of_bricks > 0){
	        if(chances == 0){
	            number_of_bricks = number_of_bricks - (2*i);
	            chances = 1;
	        }
	        else{
	            number_of_bricks = number_of_bricks -i;
	            chances = 0;
	        }
	        j++;
	    }
	    
	    if(chances == 0){
	        System.out.println("Patlu");
	    }
	    if(chances == 1){
	        System.out.println("Motu");
	    }
    }
}