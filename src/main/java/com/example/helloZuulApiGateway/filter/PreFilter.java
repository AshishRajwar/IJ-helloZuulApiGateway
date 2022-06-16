package com.example.helloZuulApiGateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class PreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("Pre filter run");
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        System.out.println("Request Method " + request.getMethod());
        System.out.println("Request Url " + request.getRequestURL().toString());
        return null;
    }
}
