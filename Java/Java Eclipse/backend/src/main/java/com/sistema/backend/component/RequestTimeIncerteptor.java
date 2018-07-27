package com.sistema.backend.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeIncerteptor extends HandlerInterceptorAdapter {//Heredar metodos para el control de los interceptores de request
	
	private static final Log LOG = LogFactory.getLog(RequestTimeIncerteptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)//Esto se ejecuta antes de que el request se lleve a cabo
			throws Exception {
		
		request.setAttribute("StarTime", System.currentTimeMillis());//Esto agrega un atributo al request llamado StarTime el cual almacena el momento exacto del tiempo en el que se crea el request
		return true;
	}
	

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)//Esto se ejecuta antes de que la vista se renderise
			throws Exception {
		
		long startTime =(long)request.getAttribute("StarTime");//Sacamos el valor almacenado en el starTime y lo metemos a una variable llamada starTime de tipo long
		LOG.info("--Request URL: " + request.getRequestURL().toString() + "TOTAL TIME: " + (System.currentTimeMillis() - startTime) + " ms");
	}

}
