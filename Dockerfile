FROM openjdk:17
VOLUME /tmp
EXPOSE 8091
ADD ./target/ms-customer-intk-0.1.jar ms-customer-intk-0.1.jar
ENTRYPOINT ["java", "-jar", "/ms-customer-intk-0.1.jar"]