FROM 10.20.106.6:5001/nginx:1.21.6-alpine

RUN rm -rf /etc/nginx/conf.d/default.conf
RUN mkdir -p /usr/local/nginx/conf/ssl

COPY nginx.conf /etc/nginx/conf.d
COPY cert.pem /usr/local/nginx/conf/ssl
COPY key.pem /usr/local/nginx/conf/ssl
