package com.conf.devscom.apigateway.proxies

import com.conf.devscom.apigateway.model.Presentation
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "bitcoin-microservice", url = "bitcoin-money:3333/presentation")
interface BitcoinMicroApiGatewayProxy{
    @GetMapping()
    fun presentation(): Presentation
}
