package com.MyProject.Movies.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

	@Component("requestTimeInterceptorMovie")
	public class RequestTimeInterceptorMovie extends  HandlerInterceptorAdapter{
	
	private static final Log LOG = LogFactory.getLog(RequestTimeInterceptorMovie.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		request.setAttribute("startTime", System.currentTimeMillis());//Antes de que se ejecute el controlador, guardara en esta peticion el tiempo actual en milisegundos
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
		long starTime = (long) request.getAttribute("startTime");//Variable long la cual se llena con el valor de request del metodo de arriba , el long entre parentesis es para convertir lo que retorna del request a tipo long.
		
		LOG.info("--REQUEST URL: " + request.getRequestURL().toString() + "-- TOTAL TIME: " + (System.currentTimeMillis() - starTime) + " ms");
	}


}
