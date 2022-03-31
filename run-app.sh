#!/bin/bash

# Clean & package app
./mvnw clean && ./mvnw package

# create image
docker build -t carduin/lo-poti-chat:latest .

#create new container and delete previous if exists
docker run --rm -d -p 80:8080 --name lo-poti-chat carduin/lo-poti-chat

#cleanup of the old image
docker rmi `docker images --filter dangling=true -q`