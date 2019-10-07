package com.conf.devscom.apigateway.proxies

import com.conf.devscom.apigateway.model.Presentation
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "user-microservice", url = "users:7000/presentation")
interface UserMicroApiGatewayProxy{
    @GetMapping()
    fun presentation(): Presentation
}
