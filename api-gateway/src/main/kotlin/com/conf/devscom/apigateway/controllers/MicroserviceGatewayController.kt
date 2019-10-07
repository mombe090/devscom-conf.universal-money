package com.conf.devscom.apigateway.controllers

import com.conf.devscom.apigateway.model.Presentation
import com.conf.devscom.apigateway.proxies.*
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MicroserviceGatewayController(
    private val userMicroApiGatewayProxy: UserMicroApiGatewayProxy,
    private val bankMicroApiGatewayProxy: BankMicroApiGatewayProxy,
    private val bitcoinMicroApiGatewayProxy: BitcoinMicroApiGatewayProxy,
    private val mobilePayementMicroApiGatewayProxy: MobilePayementMicroApiGatewayProxy,
    private val externalDataMicroApiGatewayProxy: ExternalDataMicroApiGatewayProxy
) {
    val log = LoggerFactory.getLogger(MicroserviceGatewayController::class.java)

    @GetMapping("presentation")
    fun presentation(): Presentation {
        log.info("Fetching data on the gateway")
        return Presentation(
            "Api Gateway",
            "Kotlin",
            "SPRING BOOT",
            "2.1.9",
            "Je suis chargé de distribuer les requetes au microservices et renvoyer le la response au client",
            "OMG we are the most one who love microservices, we are spring boot",
            "https://spring.io/"
        )
    }

    @GetMapping("user-services")
    fun userServicePresentation(): Presentation {
        log.info("Fetching data on user-microservice through the gateway")
        return this.userMicroApiGatewayProxy.presentation()
    }

    @GetMapping("bank-services")
    fun bankServicePresentation(): Presentation {
        log.info("Fetching data on bank-microservice through the gateway")
        return this.bankMicroApiGatewayProxy.presentation()
    }

    @GetMapping("bitcoin-services")
    fun bitcoinServicePresentation(): Presentation {
        log.info("Fetching data on bitcoin-money-microservice through the gateway")
        return this.bitcoinMicroApiGatewayProxy.presentation()
    }

    @GetMapping("external-data-services")
    fun externalDataServicePresentation(): Presentation {
        log.info("Fetching data on external-data-microservice through the gateway")
        return this.externalDataMicroApiGatewayProxy.presentation()
    }

    @GetMapping("mobile-payment-services")
    fun mobilePayementServicePresentation(): Presentation {
        log.info("Fetching data on mobile-payment-microservice through the gateway")
        return this.mobilePayementMicroApiGatewayProxy.presentation()
    }
}
