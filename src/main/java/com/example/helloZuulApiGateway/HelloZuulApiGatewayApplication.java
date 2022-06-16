package com.example.helloZuulApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class HelloZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloZuulApiGatewayApplication.class, args);
	}

//	@Bean
//	public ZuulFilter postFilter() {
//		return new ZuulFilter() {
//			@Override
//			public String filterType() {
//				return "pre";
//			}
//
//			@Override
//			public int filterOrder() {
//				return 1;
//			}
//
//			@Override
//			public boolean shouldFilter() {
//				return true;
//			}
//
//			@Override
//			public Object run() throws ZuulException {
//				System.out.println("Pre filer run");
//				HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
//				System.out.println("Request Method " + request.getMethod());
//				System.out.println("Request Url " + request.getRequestURL().toString());
//				return null;
//			}
//		};
//	}
}
