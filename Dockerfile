FROM golang:alpine
ENV LANG=C.UTF-8
#compile linux only
ENV GOOS=linux
LABEL name="spdx"
LABEL version="1.0"
RUN apk add --update gcc g++ make wget curl bash libxslt libc-dev libxml2 libxml2-dev zip
RUN apk --no-cache add openssh curl 

ADD src /go/src
ADD config /go/src/config
ADD iepd iepd
ADD xml xml
ADD tmp tmp

WORKDIR /go/src/spdx-security


#build the binary with debug information removed
RUN go build -ldflags '-w -s' -a -installsuffix cgo -o xsdprov
RUN go build -ldflags '-w -s' -a -installsuffix cgo -o spdx-security
RUN go install spdx-security

EXPOSE 8080
CMD ["spdx-security"]