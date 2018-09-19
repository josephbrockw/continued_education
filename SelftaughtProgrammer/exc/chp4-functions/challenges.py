def input_sqr(x):
	"""
	Returns x squared
	:param x: int, float
	:return: x squared
	"""

def print_str(x):
	"""
	Prints string	
	:param x: string 
	prints x
	"""
	print(x)

def so_many_arguments(a, b, c, d = 4, e = 5):
	"""
	Returns the sum of all arguments 
	:param a: int, float
	:param b: int, float
	:param c: int, float
	:param d: int, float
	:param e: int, float
	:return: int, float sum of all arguments 
	"""
	return a + b + c + d + e

def divide_by_2(x):
	"""
	Returns x divided by 2 
	:param x: int, float
	:return: x divided by 2 
	"""
	return x / 2

def multiply_by_4(x):
	"""
	Returns x multiplied by 4 
	:param x: int, float
	:return: int, float x multiplied by 4 
	"""
	return int(x) * 4

num = divide_by_2(8)
print(multiply_by_4(num))

def convert_str_float(x):
	"""
	Returns x converted to float 
	:param x: string 
	:return: float x 
	"""
	try:
		return float(x)
	except ValueError:
		print("must be a number")

convert_str_float(4)
