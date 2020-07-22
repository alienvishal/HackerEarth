'''
# Sample code to perform I/O:

name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT

# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''

# Write your code here
def zoo_problem():
    str = input()
    if len(str) <= 20:
        count = 0
        word_z = []
        word_o = []
        for letter in str:
            if letter == 'z':
                word_z.append(letter)
            else:
                word_o.append(letter)
        if len(word_z) * 2 == len(word_o):
            print('Yes')
        else:
            print('No')

if __name__ == '__main__':
    zoo_problem()
