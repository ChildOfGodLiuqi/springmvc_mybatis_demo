package com.zxl.sp.utils;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener("servletContext 监听器")
public class ContextListener implements ServletContextAttributeListener {


	@Override
	public void attributeAdded(ServletContextAttributeEvent scab) {
		System.err.println("attributeAdded******************：log4jConfigLocation="
	+scab.getServletContext().getInitParameter("log4jConfigLocation"));
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scab) {
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scab) {
		
	}

}
