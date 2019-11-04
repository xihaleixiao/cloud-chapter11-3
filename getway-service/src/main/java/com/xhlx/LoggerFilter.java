package com.xhlx;

import brave.Tracer;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @author xhlx
 * @date 2019/11/4 14:02
 * @description
 **/
@Component
public class LoggerFilter extends ZuulFilter {

    @Autowired
    Tracer tracer;

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        tracer.currentSpan().tag("operator", "lay");
        System.out.println("traceId------->" + tracer.currentSpan().context().traceId());
        return null;
    }
}
