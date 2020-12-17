cd ~/inhere/
find . | xargs file | grep "ASCII text"| awk '{print substr($1, 1,length($1)-1)}' | xargs du -b | grep 1033
#other solution find . -type f -readable ! -executable -size 1033c
cat ./maybehere07/.file2
#DXjZPULLxYr17uwoI01bNLQbtFemEgo7