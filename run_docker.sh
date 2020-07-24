#!/bin/bash
#Prerequisites: - maven & docker
# Testing github webhook trigger
# test 2
#mvn compile && mvn package
docker build -t codesenju/conversion .
docker run --rm -ti codesenju/conversion
