package com.masai.app;

import java.util.List;
import java.util.Map;

public class PersonService {
	
	private Map <Person, Gym> theMap;

	private List<Person> theList;

	private String appName;
	
	public void printMap(){
		
		System.out.println(theMap);

	}

	public void printList(){
		
		Person prs1=new Person();
		System.out.println(theList);

	}

	public void printAppName(){

		System.out.println(appName);

	}

}
