package com.victorfirsttutorial.backendninja.service.impl;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.victorfirsttutorial.backendninja.service.EjercisioAutoEvaluation;

@Service("ejercisioaAutoEvaluationClass")
public class ejercisioAutoEvaluationImpl implements EjercisioAutoEvaluation {
	
	private static final Log LOGGER =LogFactory.getLog(ejercisioAutoEvaluationImpl.class);

	@Override
	public void MostrarLog() {
		LOGGER.info("HELLO FROM SERVICE.");
		
	}

}
