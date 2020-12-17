Download the picture and run the command:

'''
	steg gummy.png | grep nactf | gawk '{ print substr($20 , 2 , length($20)-2)}'
'''
