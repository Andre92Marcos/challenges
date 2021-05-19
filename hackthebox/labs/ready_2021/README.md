We start with a nmap scan:

	sudo nmap -sC -sV -oA nmap_ready 10.10.10.220

This shows us that there is a gitlab runnig on port 5080

Connecting to 10.10.10.220:5080, we can see that there is a gitlab running with public registrations.

We register a new account so that we can find the version of the gitlab running and to see if there a some projects or another info already attached to the account.

No projects are created but if we go to /help we can see that the version of gitlab running is 11.4.7
We can use searchsploit to find some already existing exploit by doing:

	searchsploit gitlab

But nothing relevant to our version comes up.

By searching some info on the 11.4.7 release we find that it has been released in November of 2018. And by searching in the gitlab repository for commits about merge branch security we can find that just after the release of the 11.4.7 version a bunch of security related commits were done at the end of November.

In this commits there is one that fixes one ssrf vulnerability which looks promising to exploit. We can exploit this by going to our newly created gitlab account, and to the import section, and import by repo url, we can find a write box that accepts urls. Is in this box that we can do a ssrf.


