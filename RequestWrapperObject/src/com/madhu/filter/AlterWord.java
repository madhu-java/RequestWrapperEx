package com.madhu.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

import com.madhu.customizedrequet.CusstomizedRequest;

@WebFilter("/test")
public class AlterWord extends HttpFilter implements Filter {

	private static final ServletRequest HttpServletRequest = null;


	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpservletrequest =(HttpServletRequest) request;
		
		CusstomizedRequest cusstomizedRequest = new CusstomizedRequest(httpservletrequest);

		// pass the request along the filter chain
		chain.doFilter(cusstomizedRequest, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
