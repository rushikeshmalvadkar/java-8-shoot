package com.java.eight.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.eight.problem.halperClasses.Patient;

public class ProblemNine {
   /*
    * java 8 filter
    * 
    */
	
	public static void main(String[] args) {
		  
		List<Patient> patients = new ArrayList();
		   
		  Patient patient1 = new Patient("rushikesh", 23, "corona");
		  Patient patient2 = new Patient("abhishek", 34,"corona");
		  Patient patient3 = new Patient("sunita", 24, "corona");
		  Patient patient4 = new Patient("sanket", 22, "fever");
		  Patient patient5 = new Patient("sachin", 21, "corona");
            
		  patients.add(patient1);
		  patients.add(patient2);
		  patients.add(patient3);
		  patients.add(patient4);
		  patients.add(patient5);
		  List<String> result = patients.stream().filter(p->p.getAge()<25).filter(p->p.getDisease().equals("corona")).map(p->p.getName()).collect(Collectors.toList());
		  System.out.println(result);
		 
		}
	
		
	}
	

     
	

