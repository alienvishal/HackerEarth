'''
# Sample code to perform I/O:
 
name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT
 
# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''
 
# Write your code here
def friends_relationship():
	test_cases = int(input())
	# storing the value in an array
	usr_inputs = []
	while test_cases > 0:
		value = int(input())
		usr_inputs.append(value)
		test_cases = test_cases - 1
	# Iterating the user input
	for usr_input in usr_inputs:
		# Iterating each user input to produce pattern 
		for row in range(usr_input):
			for col in range(2 * usr_input):
				if col >= row + 1 and col < (2 * usr_input) - row - 1:
					print("#", end = '')
				else:
					print("*", end = '')	
			print()
		print("\n\n\n\n")
												
if __name__ == '__main__':
	friends_relationship()