numbers='111 98 100 117 103 124 98 116 100 50 50 96 89 67 53 83 68 83 54 126'
numbers=$(echo $numbers | gawk '{s="";n=split($0, a ," ");for(i=1;i<=n;i++){s=s a[i] ","}; print substr(s, 1, length(s)-1) }')
python3 numbers.py $numbers
