mkdir /tmp/todelete
cp data.txt /tmp/todelete
cd /tmp/todelete
xxd -r data.txt > data
file data
mv data data2.bin.gz
gzip -d data2.bin.gz
file data2.bin
mv data2.bin data2.bin.bz2
bzip2 -d data2.bin.bz2
file data2.bin
mv data2.bin data4.bin.gz
gzip -d data4.bin.gz
file data4.bin
tar -xf data4.bin.tz
file data5.bin
mv data5.bin data5.bin.tz
tar -xf data5.bin.tz
file data6.bin 
mv data6.bin data6.bin.bz2
bzip2 -d data6.bin.bz2
file data6.bin
mv data6.bin data6.bin.tz
tar -xf data6.bin.tz
file data8.bin
mv data8.bin data8.bin.gz
gzip -d data8.bin.gz
file data8.bin
cat data8.bin
#8ZjyCRiBWFYkneahHwxCv3wb2a1ORpYL