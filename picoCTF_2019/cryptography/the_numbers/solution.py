#we can see in the picture that each number corresponds to a letter in the alphabet so we just need to write a script to convert int to char

numbers = "16 9 3 15 3 20 6 20 8 5 14 21 13 2 5 18 19 13 1 19 15 14"
flag = (''.join(map(lambda x: chr(int(x) + ord('a') -1) , numbers.split() )).replace('picoctf', 'picoCTF{') +'}').upper()
print(flag)