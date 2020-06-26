#!/bin/bash
docker build -t codesenju/conversion .
docker rm --rm -ti codesenju/conversion
