package com.conf.devscom.apigateway.proxies

import com.conf.devscom.apigateway.model.Presentation
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "external-service", url = "external-data:4567/presentation")
interface ExternalDataMicroApiGatewayProxy{
    @GetMapping(
        consumes = [MediaType.APPLICATION_JSON_UTF8_VALUE],
        produces = [MediaType.APPLICATION_JSON_UTF8_VALUE]
    )
    fun presentation(): Presentation
}
