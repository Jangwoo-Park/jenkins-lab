#!/bin/bash

while true 
do
	echo '<pre>' > /var/htdocs/index.html
	date >> /var/htdocs/index.html
	/usr/games/fortune -a | /usr/games/cowsay >> /var/htdocs/index.html
	echo '</pre>' >> /var/htdocs/index.html
	sleep 5
done
