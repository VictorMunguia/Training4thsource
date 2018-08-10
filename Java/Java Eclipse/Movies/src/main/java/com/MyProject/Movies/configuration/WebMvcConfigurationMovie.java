package com.MyProject.Movies.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.MyProject.Movies.component.RequestTimeInterceptorMovie;


@Configuration
public class WebMvcConfigurationMovie implements WebMvcConfigurer{
	
	@Autowired
	@Qualifier("requestTimeInterceptorMovie")
	private RequestTimeInterceptorMovie requestTimeInterceptorMovie;
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(requestTimeInterceptorMovie);//Este registro nos permite imprimir nuestro interceptor
	}

}
