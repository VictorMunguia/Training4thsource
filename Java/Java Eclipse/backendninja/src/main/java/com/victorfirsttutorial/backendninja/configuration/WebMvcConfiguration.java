package com.victorfirsttutorial.backendninja.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.victorfirsttutorial.backendninja.component.RequestTimeInterceptor;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer{//Implementamos una interfaz para usar los metodos que contiene y modificar el projecto.
	
	
	@Autowired //Indicamos a sprint que vamos a inyectar un componente que se encuentra en su memoria.
	@Qualifier("requestTimeInterceptor")
	
	private RequestTimeInterceptor requestTimeInterceptor;//Invocamos la clase de nuestro RequestTime

	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(requestTimeInterceptor);//Este registro nos permite imprimir nuestro interceptor
	}


}
