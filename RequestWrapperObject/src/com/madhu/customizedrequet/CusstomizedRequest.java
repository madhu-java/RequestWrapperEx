package com.madhu.customizedrequet;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CusstomizedRequest extends HttpServletRequestWrapper {

	public CusstomizedRequest(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}
@Override
public String getParameter(String name) {
	System.out.println("name is:"+name);
	String word = super.getParameter(name);
	
	System.out.println("word typed:"+word);
	if(word.equalsIgnoreCase("java")||word.equalsIgnoreCase("jee")||word.equalsIgnoreCase("spring"))
		return "SLEEP";
	return word;
}

}
