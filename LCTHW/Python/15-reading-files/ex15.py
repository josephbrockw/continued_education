#imports argv from sys module
from sys import argv

# initiates variables as argv
script, filename = argv

# opens file and sets it to the vairable txt
txt = open(filename)

# prints the file name followed by the file's text
print(f"Here's your file {filename}:")
print(txt.read())

txt.close()

