package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.model.Person;
import com.udemy.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{
	
	private static final Log LOG = LogFactory.getLog(ExampleService.class);

	@Override
	public List<Person> getListPeople() {
		 List<Person> people = new ArrayList<>();
		 people.add(new Person("Pepe", 23));
		 people.add(new Person("Luis", 30));
		 people.add(new Person("Maria", 25));
		 people.add(new Person("Wil", 20));
		 LOG.info("HELLO FROM SERVICE");
		 return people;
	}

}
