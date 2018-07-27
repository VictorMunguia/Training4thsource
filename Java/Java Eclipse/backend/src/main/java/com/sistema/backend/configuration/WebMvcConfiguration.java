package com.sistema.backend.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sistema.backend.component.RequestTimeIncerteptor;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer{//Esto nos permite implementar la interfaz la cual contiene todos los metodos para configurar la intercepcion de request.
	
	@Autowired
	@Qualifier("requestTimeInterceptor")
	private RequestTimeIncerteptor requestTimeIncerceptor;//Mandamos a inyectar el requesTime

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestTimeIncerceptor);//Le decimos que al registry le vamos a agregar un interceptor.
	}

}
