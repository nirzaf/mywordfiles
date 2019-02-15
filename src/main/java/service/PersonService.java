package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Person;


@Service
public class PersonService {
Hashtable<String,Person> hshTable=new Hashtable<>();

public PersonService() {
	Person person=new Person();
	person.setId(1);
	person.setFirstName("A");
	hshTable.put("1", person);
	
	Person person1=new Person();
	person1.setId(1);
	person1.setFirstName("A");
	hshTable.put("2", person1);
	
}
public Person getPerson(String id) {
	if(hshTable.containsKey(id)) {
		return hshTable.get(id);}
		else 
			return null;
	
	}

public Hashtable<String,Person> getAll(){
	return hshTable;
	
}
	
	
}

	

//person.setFirstName("A");





