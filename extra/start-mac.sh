#!/usr/bin/env bash

program=$0
# $0 might be a softlink, resolve it.
while [ "$(readlink -n "$program")" != "" ]; do
    program=$(readlink -n "$program")
done
working_dir=$(dirname "$program")
cd "$working_dir"

java_version=$(java -version 2>&1 | awk -F '"' '/version/ {print $2}')
if [[ "$java_version" > "1.8" ]]; then
    java --module-path lib --add-modules javafx.controls,javafx.fxml,javafx.base --add-exports javafx.base/com.sun.javafx.collections=ALL-UNNAMED -jar spider.jar
else
    java -jar spider.jar
fi
