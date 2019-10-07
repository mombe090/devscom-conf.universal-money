package com.confdevscom.gn;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.*;

//4567
public class ApplicationBoostrap {


    public static void main(String[] args) {
        Logger logger =  LoggerFactory.getLogger(ApplicationBoostrap.class);

        options("/*",
                (request, response) -> {

                    String accessControlRequestHeaders = request
                            .headers("Access-Control-Request-Headers");
                    if (accessControlRequestHeaders != null) {
                        response.header("Access-Control-Allow-Headers",
                                accessControlRequestHeaders);
                    }

                    String accessControlRequestMethod = request
                            .headers("Access-Control-Request-Method");
                    if (accessControlRequestMethod != null) {
                        response.header("Access-Control-Allow-Methods",
                                accessControlRequestMethod);
                    }

                    return "OK";
                });

        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));
        before((request, response) -> response.type("application/json"));

        Gson gson = new Gson();

        get("/presentation", "application/json", (request, response) -> {
            logger.info("Fetching data from external data service");
              return   new
                Presentation(
                "External Data Service",
                "JAVA",
                "SPARK MICRO-FRAMEWORK",
                "2.5",
                "Je suis chargé d'aller attaquer les API de wall street pour savoir le taux d'échange entre toutes les money du monde",
                "Indeed we love microservices",
                "http://sparkjava.com"
        );
        }, gson::toJson);
    }
}
