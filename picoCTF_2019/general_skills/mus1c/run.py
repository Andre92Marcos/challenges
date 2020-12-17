#convert the lyrics of the file on a online rockstar compiler like https://codewithrockstar.com/online

data = '''114
114
114
111
99
107
110
114
110
48
49
49
51
114'''.split('\n')
print("picoCTF{" + ''.join(map(chr,map(int,data))) + "}")