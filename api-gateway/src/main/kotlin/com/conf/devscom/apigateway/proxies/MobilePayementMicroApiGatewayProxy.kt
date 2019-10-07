package com.conf.devscom.apigateway.proxies

import com.conf.devscom.apigateway.model.Presentation
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "mobile-microservice", url = "mobile-payment:5000/presentation")
interface MobilePayementMicroApiGatewayProxy{
    @GetMapping()
    fun presentation(): Presentation
}
