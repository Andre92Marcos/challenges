## Solution

First download the pdf. We can read the contentsof the pdf using less.

'''
	less challenge.pdf
'''

On the contents of the pdf we find a hint suggesting that the pdf file might be a ruby script, so we run it as a ruby script:

'''
	ruby challenge.pdf
'''

The ruby script opens a webserver running at localhost:8080. We can access the webserver and download the file that it provides.

The file is a zipfile constains a folder called feelies, with a false_flag.md and mutool·

Use the mutool to render a picture to get details for the next step of the solution. The command to use the mutool is in the false_flag.md

	./mutool draw -r 300 -o rendered.png ../challenge.pdf
