package org.example.apigateway.config;

import org.example.apigateway.security.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Value("${banks-service.url}") private String banksServiceUrl;
    @Value("${banks-service.id}") private String banksServiceId;
    @Value("${banks-service.path}") private String banksServicePath;

    private final JwtAuthenticationFilter filter;

    public RouteConfig(JwtAuthenticationFilter filter) {
        this.filter = filter;
    }
    @Bean
    public RouteLocator createRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route(banksServiceId,route -> route.path(banksServicePath).filters(gtf -> gtf.filter(filter)).uri(banksServiceUrl))
                .route("auth-service", route -> route.path("/api/auth/**").uri("http://localhost:8084"))
                .build();
    }

}
