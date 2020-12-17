wget https://www.nactf.com/files/439581a82f0ae49387ecd38eb180813b/flag.zip?token=eyJ1c2VyX2lkIjoxOTc5LCJ0ZWFtX2lkIjoxMzEwLCJmaWxlX2lkIjo1OX0.X8EhLA.F3WKUr81L6Xa8bPRw1w1qJQpbeE -O flag.zip > /dev/null 2>&1
unzip -o flag.zip > /dev/null

counter=1000
direction=$(cat direction.txt)
while [ $counter -ne 0 ]
do
	zip=$counter$direction'.zip'
	((counter--))
	unzip -o $zip > /dev/null
	direction=$(cat direction.txt)
done
flag=$(cat flag.txt)
rm -rf *.zip
rm -rf *.txt
echo $flag
