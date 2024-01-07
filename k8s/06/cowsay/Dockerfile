# docker image build -t yu3papa/cowsay:1.0 .

FROM chuanwen/cowsay
COPY cowsay_loop.sh /
RUN chmod u+x /cowsay_loop.sh
WORKDIR /
VOLUME /var/htdocs
ENTRYPOINT /cowsay_loop.sh


