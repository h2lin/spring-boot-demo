# 基础镜像使用java
FROM java:8
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为app.jar
ADD spring-boot-demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 30099
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]