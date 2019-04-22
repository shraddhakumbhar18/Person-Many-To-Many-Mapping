package com.capgemini.PersonManyToMany.service;

import java.util.Set;

import com.capgemini.PersonManyToMany.entity.Person;

public interface PersonService 
{
	public Set<Person> addNew(Set<Person> person);
	public Person getPerson(int id);
}
