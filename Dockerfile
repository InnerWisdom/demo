FROM gradle
COPY build/classes/java/main/ /tmp
WORKDIR /tmp
CMD java com.example.demo.DemoApplication
