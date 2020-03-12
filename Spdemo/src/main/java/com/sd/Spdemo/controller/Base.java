package com.sd.Spdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sd.Spdemo.students;

 @RestController
 @CrossOrigin
public class Base {
	 @Autowired
	studentRepository stud;
	@RequestMapping(path = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Object> createnewStudent( @RequestBody students students) {
 students student= stud.save( students);
 return new ResponseEntity<Object>(student, HttpStatus.OK);
  
}
	@RequestMapping(path="/get", method=RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<List<students>> getStudents()
{
		List<students> studentsList = new ArrayList<students>();
		stud.findAll().forEach(s -> studentsList.add(s));
		 return new ResponseEntity<List<students>>(studentsList , HttpStatus.OK);
		 
}
	@RequestMapping(path="/update", method=RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateStudent(@RequestBody students students)
	{
		 students student= stud.save( students);
		 return new ResponseEntity<Object>(student, HttpStatus.OK);
	
	}

	
	
}
 
 
 