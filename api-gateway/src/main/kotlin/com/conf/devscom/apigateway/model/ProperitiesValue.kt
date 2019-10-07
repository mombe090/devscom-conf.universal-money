package com.conf.devscom.apigateway.model

import org.springframework.beans.factory.annotation.Value

data class ProperitiesValue(
    @Value("\${my-propertie.hostIp}")
    val hostIp: String
)
