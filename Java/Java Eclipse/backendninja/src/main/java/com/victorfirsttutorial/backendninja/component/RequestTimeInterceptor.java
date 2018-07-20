package com.victorfirsttutorial.backendninja.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter{//Esta clase nos va a permitir atrapar las peticiones antes de que entre a las clases.
	
	private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);
	
	@Override//Este metododo se va a ejecutar antes de entrar en el metodo del controlador 
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)//El objeto request trae toda la informacion del request del usuario.
			throws Exception {
		request.setAttribute("startTime", System.currentTimeMillis());//Antes de que se ejecute el controlador, guardara en esta peticion el tiempo actual en milisegundos
		return true;
	}


	@Override//Este se ejecuta antes de escupir la vista en el navegador
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		long starTime = (long) request.getAttribute("startTime");//Variable long la cual se llena con el valor de request del metodo de arriba , el long entre parentesis es para convertir lo que retorna del request a tipo long.
		
		LOG.info("--REQUEST URL: " + request.getRequestURL().toString() + "-- TOTAL TIME: " + (System.currentTimeMillis() - starTime) + " ms");
		//Creamos el log, primero pedimos la URL del request y la convertimos a string, luego sacamos el tiempo actual con System.currentime y le restamos el tiempo anterior que se saco del metodo
		//preHandle el cual se guardo en la variable starTime.
		
		//Para poder llevar a cabo esta clase para tomar el request, tenemos que crear una clase de configuracion.
	}
}
