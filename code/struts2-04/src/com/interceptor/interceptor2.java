package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class interceptor2 implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("interceptor2��action����ִ��֮ǰ");
		String str = arg0.invoke();
		System.out.println("interceptor2��action����ִ��֮��");
		// TODO Auto-generated method stub
		return null;
	}
   
	
}
