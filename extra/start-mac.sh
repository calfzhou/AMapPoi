#!/usr/bin/env bash

java --module-path lib --add-modules javafx.controls,javafx.fxml,javafx.base --add-exports javafx.base/com.sun.javafx.collections=ALL-UNNAMED -jar spider.jar
