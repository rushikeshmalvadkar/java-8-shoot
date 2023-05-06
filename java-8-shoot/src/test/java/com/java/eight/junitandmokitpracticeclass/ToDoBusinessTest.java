package com.java.eight.junitandmokitpracticeclass;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ToDoBusinessTest {

	@Test
	void getTodosforSpringTestNoSoringContains() {
		ToDoService toDoServiceMock = Mockito.mock(ToDoService.class);
		
		List<String> todos = Arrays.asList("work","eat");
		Mockito.when(toDoServiceMock.getTodos("rushikesh")).thenReturn(todos);
		
		ToDoBusiness toDoBusiness = new ToDoBusiness(toDoServiceMock);
		List<String> todosforSpring = toDoBusiness.getTodosforSpring("rushikesh");
		assertEquals(0, todosforSpring.size());
	}
	@Test
	void getTodosforSpringTestIfContainsSpring() {
		ToDoService toDoServiceMock = Mockito.mock(ToDoService.class);
		
		List<String> todos = Arrays.asList("Spring","eat");
		Mockito.when(toDoServiceMock.getTodos("rushikesh")).thenReturn(todos);
		
		ToDoBusiness toDoBusiness = new ToDoBusiness(toDoServiceMock);
		List<String> todosforSpring = toDoBusiness.getTodosforSpring("rushikesh");
		assertEquals("Spring", todosforSpring.get(0));
		assertEquals(1, todosforSpring.size());
	}
	

}
