# Javalin GraalVM Demo

A GraalVM demo with Javalin microframework Kotlin.

### Requirement

- JDK 8
- GraalVM CE 1.0.0-rc16 ([How to Install via SDKMAN](https://e.printstacktrace.blog/installing-graalvm-ee-1-0-0-rc14-with-sdkman/))

Make sure both JDK and GraalVM have been load to class path, try:

```bash
java -version
```

```bash
native-image --help
```

### Build GraalVM native image

Build project (Fatjar):

```bash
./gradlew clean build
```

Build native image:

```bash
native-image -jar ./build/libs/javalingraalvm-1.0-SNAPSHOT-all.jar -H:+JNI -H:ReflectionConfigurationFiles=reflect.json
```

If build successful, the output native file should be available within root project: `javalingraalvm-1.0-SNAPSHOT-all`

### Run & test

Run native image with:

```bash
./javalingraalvm-1.0-SNAPSHOT-all
```

Test `http GET` to:

```bash
curl -i http://localhost:7000/health
# result: {"status":true,"code":200}
```

### Reference

- [Running Javalin on GraalVM](https://javalin.io/2018/09/27/javalin-graalvm-example.html)
- [Java to native using GraalVM - Part 1](https://royvanrijn.com/blog/2018/09/part-1-java-to-native-using-graalvm/)
- [Native microservice in GraalVM - Part 2](https://royvanrijn.com/blog/2018/09/part-2-native-microservice-in-graalvm/#results)
