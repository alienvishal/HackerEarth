/*
// Sample code to perform I/O:
 
name = Console.ReadLine();                  // Reading input from STDIN
Console.WriteLine("Hi, {0}.", name);        // Writing output to STDOUT
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
*/
 
// Write your code here
using System;
 
class CheckValidISBN
{
    public static void Main()
    {
        int sum = 0;
        string isbn = Console.ReadLine();
        
        for( int i = 1; i <= isbn.Length; i++ )
        {
            sum = sum + (i * isbn[i - 1]);
        }
        
        if(sum % 11 == 0)
        {
            Console.WriteLine("Legal ISBN");
        }
        else
        {
            Console.WriteLine("Illegal ISBN");
        }
    }
}