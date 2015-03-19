package com.tejora.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tejora.beans.ToDo;


@Controller
public class HelloController
{
	
	List<ToDo> todoList = new ArrayList<ToDo>(){{
		add(new ToDo(){ { setName("Bala"); setEmail("bala@gmail.com"); }});
		add(new ToDo(){ { setName("Rahul"); setEmail("rahul@gmail.com"); }});
	}};
	
	@RequestMapping("/hello")
	public ModelAndView sayHello(
			@RequestParam(value="name",defaultValue="Anonymous")					
			String name)
	{
		
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("name", name);
		return mv;
		
	}
	
	@RequestMapping("/getNames")
	public @ResponseBody List<String> getNames()
	{
		
		List<String> names = new ArrayList<String>(){{
			   add("A");
			   add("B");
			}};
		return names;
	}
	
	@RequestMapping("/getToDo")
	public @ResponseBody List<ToDo> getToDo() 
	{
		return todoList;
	}
	
	@RequestMapping("/addToDo")
	public @ResponseBody String addToDo(@RequestParam(value="name") String name,
										@RequestParam(value="email") String email) 
	{
		ToDo todo = new ToDo();
		todo.setName(name);
		todo.setEmail(email);
		
		todoList.add(todo);
		return "Added !!!!";
	}
	
	@RequestMapping("/deleteToDo")
	public @ResponseBody String deleteToDo(@RequestParam(value="name") String name) 
	{
		int i= 0;
		for (ToDo toDo : todoList) 
		{
			if(toDo.getName().equalsIgnoreCase(name))
			{
				todoList.remove(i);
				break;
			}
			i++;
		}
		return "Deleted !!!!";
	}
	
}
