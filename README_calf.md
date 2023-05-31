# 补充说明

## Build

I use Java 1.20.

``` bash
# Switch Java version.
export JAVA_HOME=`/usr/libexec/java_home -v 1.20`

# Use `calf` branch to build (added JavaFX).
git checkout calf

# Build and run, way 1:
mvn clean install -Dmaven.test.skip=true
java --module-path target/lib --add-modules javafx.controls,javafx.fxml,javafx.base --add-exports javafx.base/com.sun.javafx.collections=ALL-UNNAMED -jar target/spider-v2.0.1.jar

# Build and run, way 2:
mvn clean javafx:run
```
