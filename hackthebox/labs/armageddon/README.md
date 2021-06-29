First start with a nmap scant to 10.10.10.233

	sudo nmap -sC -sV -oA nmap_ready 10.10.10.220

We can see that there is a webserver running on port 80. Doing a get request with the browser we can see that there is somekind of login option in the main page.

The nmap scan and wappalyzer tells us that the webserver is using drupal 7.

By searching in exploit database for dupal, we can see that there is a remote code exploit in version 7.5.8 and this exploit is in metasploit


