#!/bin/bash

while true 
do
	echo '<pre>' > /var/htdocs/index.html
	date >> /var/htdocs/index.html
	fortune | cowsay >> /var/htdocs/index.html
	echo '</pre>' >> /var/htdocs/index.html
	sleep $INTERVAL
done
