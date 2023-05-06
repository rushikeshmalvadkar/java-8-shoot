package com.java.eight.junitandmokitpracticeclass;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
	 public ToDoService doService;  
	  
	    public ToDoBusiness(ToDoService doService) {  
	        this.doService = doService;  
	    }  
	      
	    public List<String> getTodosforSpring(String user) {  
	        if(user==null) {
	        	throw new NullPointerException("user should not be null");
	        }
	        List<String> retrievedtodos = new ArrayList<String>();  
	        List<String> todos = doService.getTodos(user);  
	          
	        for(String todo :todos) {  
	            if(todo.contains("Spring")) {  
	                retrievedtodos.add(todo);  
	            }  
	        }  
	        return retrievedtodos;  
	        }  
}
