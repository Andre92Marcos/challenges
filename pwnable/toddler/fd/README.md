With the user that we login we don't have permission to read the flag file

Looking at the code of fd.c, we can see that it reads the flag file, and for that we need to run the fd file with the int value of 0x1234

'''
	python3 -c "print(int(0x1234))"
	4660

'''
Runnig the fd file with 4660, we can then pass to the stdin the string that it is looking for

'''
	./fd 4660
	LETMEWIN

'''

# flag: mommy! I think I know what a file descriptor is!!
