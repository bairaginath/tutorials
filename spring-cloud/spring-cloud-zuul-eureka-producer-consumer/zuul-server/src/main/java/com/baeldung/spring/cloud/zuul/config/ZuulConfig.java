package com.baeldung.spring.cloud.zuul.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.baeldung.spring.cloud.zuul.filter.ErrorFilter;
import com.baeldung.spring.cloud.zuul.filter.PostFilter;
import com.baeldung.spring.cloud.zuul.filter.PreFilter;
import com.baeldung.spring.cloud.zuul.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
//@EnableDiscoveryClient
public class ZuulConfig {
    public static void main(String[] args) {
        SpringApplication.run(ZuulConfig.class, args);
    }
      @Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
