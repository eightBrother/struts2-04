package com.action;

import com.opensymphony.xwork2.ActionSupport;


public class InterceptorAction extends ActionSupport{
	
	
    public String say(){
    	System.out.println("Action中say方法执行");
    	return "success";
    }
	

}
