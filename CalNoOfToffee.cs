/*
// Sample code to perform I/O:
 
name = Console.ReadLine();                  // Reading input from STDIN
Console.WriteLine("Hi, {0}.", name);        // Writing output to STDOUT
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
*/
 
// Write your code here
using System;
 
class CalNoOfToffee
{
    public static void Main()
    {
        int countNoOfToffee = 0;
        float calCircumferenceOfCircle;
        int distance, amount, radius;
        int testCase = Convert.ToInt32(Console.ReadLine());
        
        for( int i = 0; i < testCase; i++ )
        {
            string[] input = Console.ReadLine().Split();
            radius = Convert.ToInt32(input[0]);
            amount = Convert.ToInt32(input[1]);
            distance = amount * 100;
            calCircumferenceOfCircle = (2 * 22 * radius) / 7;
            
            if(distance >= calCircumferenceOfCircle)
            {
                countNoOfToffee++;
            }
        }
        
        Console.WriteLine(countNoOfToffee);
    }
}