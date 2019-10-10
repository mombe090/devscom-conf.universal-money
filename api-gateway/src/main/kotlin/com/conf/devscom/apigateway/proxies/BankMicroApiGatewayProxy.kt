package com.conf.devscom.apigateway.proxies

import com.conf.devscom.apigateway.model.Presentation
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "bank-microservice", url = "nginx-lumen-wrapped/presentation")
interface BankMicroApiGatewayProxy{
    @GetMapping()
    fun presentation(): Presentation
}
