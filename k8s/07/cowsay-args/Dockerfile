# docker image build -t yu3papa/cowsay:args .
FROM chuanwen/cowsay

ENV PATH=$PATH:/usr/games
ADD cowsay_loop.sh /bin/cowsay_loop.sh
RUN chmod u+x /bin/cowsay_loop.sh
VOLUME /var/htdocs

ENTRYPOINT ["/bin/cowsay_loop.sh"]
CMD ["10"]
