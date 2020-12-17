mkdir /tmp/todelete2
cd /tmp/todelete2
git clone ssh://bandit29-git@localhost/home/bandit29-git/repo
#bbc96594b4e001778eee9975372716b2
cd repo
cat README.md
git lop -p
git branch -a
git checkout origin/dev
cat README.md
#5b90576bedb2cc04c86a9e924ce42faf