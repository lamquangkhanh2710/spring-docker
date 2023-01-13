From openjdk:18.0.1
copy ./target/com.lqkhanh.spring-docker-1.0.jar com.lqkhanh.spring-docker-1.0.jar
CMD ["java","-jar","com.lqkhanh.spring-docker-1.0.jar"]