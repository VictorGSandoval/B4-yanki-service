package com.bank.yanki.service.router;

import com.bank.yanki.service.handler.YankiHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> routes (YankiHandler handler) {
        return route(GET("/yanki"), handler::findAll)
                .andRoute(GET("/yanki/{id}"), handler::findId)
                .andRoute(POST("/yanki"),handler::create);
    }
}
