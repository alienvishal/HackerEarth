'''
# Sample code to perform I/O:
 
name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT
 
# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''
 
# Write your code here
import array as arr
 
def Magic():
  testcases = input()
  string = input().split(' ')
  input_testcase = arr.array('i')
  val = arr.array('i')
  index = arr.array('i')
  sum = 0
  smallest_index = 0
  flag = 0
  count = 0
  # To store the input value in array
  for testcase in range(int(testcases)):
    input_testcase.insert(testcase, int(string[testcase]))
    sum = sum + int(string[testcase])
  # To calculate the value
  for i in range(len(input_testcase)):
    ans = sum - input_testcase[i]
    if ans % 7 == 0:
      val.insert(count, input_testcase[i] )
      index.insert(count, i)
      count = count + 1
      flag = 1
 
  if flag == 1:
    smallest_index = val.index(min(val))
    print(index[smallest_index])
  else:
    print(-1)
  
if __name__ == "__main__":
  Magic()