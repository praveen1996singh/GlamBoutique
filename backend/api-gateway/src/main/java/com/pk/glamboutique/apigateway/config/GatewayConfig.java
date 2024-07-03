package com.pk.glamboutique.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(r -> r.path("/service1/**")
                .uri("lb://SERVICE1"))
            .route(r -> r.path("/service2/**")
                .uri("lb://SERVICE2"))
            .build();
    }
}
