package com.victorfirsttutorial.backendninja.component;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("ExampleComponent")//Esto le dice a sprint que estamos creando un componente, con el nombre examplecomponent
public class ExampleComponent {//Este componente fue llamado en el controlador ControllerLista
	
	private static final Log LOG = LogFactory.getLog(ExampleComponent.class);// Inicializamos un log
	
	public void sayHello() {
		LOG.info("Hello from exampleComponent.");//Este metodo cuando se ejectue mandara el log a la consola
	}

}
