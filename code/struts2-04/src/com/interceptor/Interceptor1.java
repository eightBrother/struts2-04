package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Interceptor1 implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

	public String intercept(ActionInvocation arg0) throws Exception {
    System.out.println("interceptor1中action方法执行之前");
	String str = arg0.invoke();
	System.out.println("interceptor1中action方法执行之后");
		// TODO Auto-generated method stub
		return str;
	}
  
   
}
