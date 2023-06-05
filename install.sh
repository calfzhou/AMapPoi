#!/usr/bin/env bash

set -exu

mvn clean install -Dmaven.test.skip=true

install_home=out/poi-crawler
rm -rf "$install_home"
mkdir -p "$install_home"
cp target/spider-*.jar "$install_home/spider.jar"
cp -r target/lib "$install_home"
cp -r vendor "$install_home"
rm -rf "$install_home/vendor/.lock"

cp extra/* "$install_home"
