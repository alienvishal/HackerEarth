/*
// Sample code to perform I/O:
 
name = Console.ReadLine();                  // Reading input from STDIN
Console.WriteLine("Hi, {0}.", name);        // Writing output to STDOUT
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
*/
 
// Write your code here
using System;
class LiftQueries
{
    public static void Main()
    {
        int min = 0;
        int max = 7;
        int diffForLiftA = 0;
        int diffForLiftB = 0;
        int testCase = Convert.ToInt32(Console.ReadLine());
        int[] floorNumber = new int[testCase]; 
        
        //Setting Up Initial Postion of the Lift
        int liftA = min;
        int liftB = max;
        
        for( int i = 0; i < testCase; i++ )
        {
        	floorNumber[i] = Convert.ToInt32(Console.ReadLine());
        	diffForLiftA = liftA - floorNumber[i];
        	diffForLiftB = liftB - floorNumber[i];
        	
        	if( Math.Abs(diffForLiftA) <= Math.Abs(diffForLiftB) )
        	{
        		liftA = floorNumber[i];
        		Console.WriteLine("A");
        	}
        	else
        	{
        		liftB = floorNumber[i];
        		Console.WriteLine("B");
        	}
        }
    }
}