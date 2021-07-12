package com.pradeep.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfig {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/inventory/**")
						.filters(f -> f.rewritePath("/inventory/(?<segment>.*)", "/${segment}"))
						.uri("lb://SELLER"))
				.route(p -> p.path("/shopping/**")
						.filters(f -> f.rewritePath("/shopping/(?<segment>.*)", "/${segment}"))
						.uri("lb://SHOPPING"))
				.build();

	}
}
