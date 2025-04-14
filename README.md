# Foo Stream

## Publish images

```sh
./mvnw package -Dmaven.test.skip=true
./mvnw -Dmaven.test.skip=true spring-boot:build-image -Dspring-boot.build-image.imageName=springdeveloper/${PWD##*/}:0.0.1
```
