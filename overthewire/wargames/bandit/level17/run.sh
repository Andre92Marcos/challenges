nmap -sV -T5 -v 127.0.0.1 -p 31000-32000
openssl s_client -connect localhost:31790
cluFn7wTiGryunymYOu4RcffSxQluehd
mkdir /tmp/sshKey
cd /tmp/sshKey
vi sshkey.private
#paste the private key and save
chmod 600 sshkey.private
ssh -i sshkey.private  bandit17@127.0.0.1