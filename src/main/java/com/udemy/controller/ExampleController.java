package com.udemy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.component.ExampleComponent;
import com.udemy.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	private static final String EXAMPLE_VIEW = "example";
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;

	//Primera forma
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		exampleComponent.sayHello();
		model.addAttribute("people", getPeople());
		return EXAMPLE_VIEW;
	}
	
	//Segunda forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("people", getPeople());
		return mav;
	}
	
	private List<Person> getPeople(){
		 List<Person> people = new ArrayList<>();
		 people.add(new Person("Pepe", 23));
		 people.add(new Person("Luis", 30));
		 people.add(new Person("Maria", 25));
		 people.add(new Person("Wil", 20));
		 return people;
	}
}
