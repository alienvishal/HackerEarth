'''
# Sample code to perform I/O:
 
name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT
 
# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''
 
# Write your code here
def isVowel(string):
  if string.lower() == 'a' or string.lower() == 'e' or string.lower() == 'i' or string.lower() == '0' or string.lower() == 'u':
    return True
  return False
 
def vcPairs():
  testcases = input()
  result = []
  for testcase in range(int(testcases)):
    lengthOfStr = int(input())
    string = input()
    arrString = list(string)
    count = 0
    for i in range(lengthOfStr - 1):
      if not isVowel(arrString[i]) and isVowel(arrString[i + 1]):
        count = count + 1
    result.append(count)
  
  for res in range(len(result)):
    print(result[res])
 
if __name__ == '__main__':
  vcPairs()