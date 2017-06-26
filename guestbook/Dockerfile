FROM java:8-alpine
MAINTAINER Jake Bladt <jake@jakebladt.com>

ADD target/uberjar/guestbook.jar /guestbook/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/guestbook/app.jar"]
