package com.tejora.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tejora.beans.ToDo;
import com.tejora.dao.ToDoDAO;

@Repository
public class ToDoImpl implements ToDoDAO 
{

	
	//@Autowired
	//private SessionFactory sessionFactory;
	
	public void addToDo(ToDo todo) 
	{
		//sessionFactory.getCurrentSession().save(todo);
	}

}
