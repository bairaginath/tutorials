package com.baeldung.spring.cloud.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("zuul-server")
public interface GreetingClient {
    @RequestMapping("/producer/greeting")
    String greeting();
}
