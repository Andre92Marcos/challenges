from pwn import *
context.log_level = 'error'

sh = remote('jupiter.challenges.picoctf.org', 41521)

binary = sh.recvuntil('Input:\n').decode('UTF-8').split('\n')[2].split(' ')[3:-3]
binary = ''.join(map(lambda x: chr(int(x, 2)), binary))
sh.sendline(binary)

octa = sh.recvuntil('Input:\n').decode('UTF-8').split('\n')[0].split(' ')[5:-3]
octa = ''.join(map(lambda x: chr(int(x, 8)), octa))
sh.sendline(octa)

hexa = sh.recvuntil('Input:\n').decode('UTF-8').split('\n')[0].split(' ')[4:-3]
hexa =  bytes.fromhex(hexa[0]).decode('UTF-8') 
sh.sendline(hexa)
flag = sh.recvall().decode('UTF-8').split('\n')[1].split(' ')[1]
print(flag)