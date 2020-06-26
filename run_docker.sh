#!/bin/bash
#Prerequisites: - maven & docker
mvn compile && mvn package
docker build -t codesenju/conversion .
docker rm --rm -ti codesenju/conversion
