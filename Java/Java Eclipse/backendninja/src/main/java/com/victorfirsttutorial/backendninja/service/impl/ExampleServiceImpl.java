package com.victorfirsttutorial.backendninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.victorfirsttutorial.backendninja.model.Person;
import com.victorfirsttutorial.backendninja.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
	
	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

	@Override
	public List<Person> getListPeople() {	
			List<Person> peopleList = new ArrayList<>();
			peopleList.add(new Person("Corey", 23, true));
			peopleList.add(new Person("Samara", 24, true));
			peopleList.add(new Person("Kimberly", 19, true));
			peopleList.add(new Person("Martha", 14, true));
			peopleList.add(new Person("Rainer", 21, true));
			peopleList.add(new Person("Sebastian", 45, true));
			peopleList.add(new Person("Yolanda", 17, true));
			LOG.info("Hello from service");
			return peopleList;
	}
	

}
