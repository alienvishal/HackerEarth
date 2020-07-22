'''
# Sample code to perform I/O:
 
name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT
 
# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''
 
# Write your code here
def cost_of_ballon():
    test_cases = int(input())
    for test_case in range(test_cases):
        cost = 0
        token = input().split(' ')
        green_ballon = int(token[0])
        purple_ballon = int(token[1])
        no_of_persons = int(input())
        first_person = []
        second_person = []
 
        for no_of_person in range(no_of_persons):
            value = input().split(' ')
            first_person.append(int(value[0]))
            second_person.append(int(value[1]))
 
        for no_of_person in range(no_of_persons):
            cost = cost + green_ballon * first_person[no_of_person]
 
        for no_of_person in range(no_of_persons):
            cost = cost + purple_ballon * second_person[no_of_person]
 
        print(cost)
 
 
if __name__ == '__main__':
    cost_of_ballon()