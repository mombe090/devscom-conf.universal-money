#!/usr/bin/env bash

echo "************************ Creating Network overlay *********"
       docker network create --driver=overlay --attachable StackMoney_Network_Overlay

echo "Running laravel lumen with nginx in compose"
       docker-compose -f ./bank-service/docker-compose.yml up --build -d

echo "****** Api-Gateway build jar ***********"
     mvn clean package -f api-gateway/pom.xml
echo "****** Api-Gateway build jar ***********"



echo "#######################"
echo "#######################"
echo "################  DOCKER BUILDING  ####################"
echo "#######################"
echo "#######################"

                docker build -t  user-service ./user-service
                docker build -t  angular-client ./angular-client
                docker build -t  api-gateway-service ./api-gateway
                docker build -t  bitcoin-money-service ./bitcoin-money-service
                docker build -t  external-data-service ./exteranaldatasservice
                docker build -t  mobile-payement-service ./mobile-payment-service

echo "------------------ TAGIN IMAGES -------------------------"
                docker tag user-service:latest mombe090/user-service
                docker tag angular-client:latest mombe090/angular-client
                docker tag api-gateway-service:latest mombe090/api-gateway-service
                docker tag bitcoin-money-service:latest mombe090/bitcoin-money-service
                docker tag external-data-service:latest mombe090/external-data-service
                docker tag mobile-payement-service:latest mombe090/mobile-payement-service
 echo "------------------ END TAGIN IMAGES -------------------------"

                docker push  mombe090/user-service
                docker push  mombe090/angular-client
                docker push  mombe090/api-gateway-service
                docker push  mombe090/bitcoin-money-service
                docker push  mombe090/external-data-service
                docker push  mombe090/mobile-payement-service

echo "#######################"
echo "#######################"
echo "#####  DOCKER BUILDING DONE SUCCESSFULLY    ###########"
echo "#######################"
echo "#######################"

