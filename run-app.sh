#!/bin/bash

# Clean & package app
./mvnw clean && ./mvnw package

# create image
docker build -t lo-poti-chat:latest .

#remove previous container (true prevents error from crashing process if container does not exist)
docker stop lo-poti-chat || true && docker rm lo-poti-chat || true

#create new container
docker run -d -p 80:8080 --name lo-poti-chat lo-poti-chat

#cleanup of the old image
docker rmi `docker images --filter dangling=true -q`