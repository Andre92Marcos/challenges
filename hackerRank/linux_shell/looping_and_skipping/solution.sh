#!/bin/bash
for number in {1..100}
do
	if [ $((number%2)) -ne 0 ]
	then
		echo $number
	fi
done

