'''
# Sample code to perform I/O:
 
name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT
 
# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''
 
# Write your code here
def print_number():
    test_cases = int(input())
    for test_case in range(test_cases):
        #Accept all the numbers in string and split
        numbers = input().split(' ')
        if len(numbers) == test_cases:
            for num in numbers:
                print(num, end = " ")
            break
        else:
            break
 
if __name__ == '__main__':
    print_number()