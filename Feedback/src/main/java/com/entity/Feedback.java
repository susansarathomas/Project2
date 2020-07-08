package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity @Table(name = "feedback")
public class Feedback {

	 @Override
	    public String toString() {
	        return "Feedback [srno=" + srno + ", name=" +name+ ",email=" +email+ ",date=" +date+  ",subject=" + subject + ", message=" + message + "]";
	    }
	@Id @GeneratedValue
	private int srno;
	private String subject;
	private String message;
	private String name;
	private String email;
	private Date date;
	
	
	public Feedback() {
	    super();
	    
	}
	public Feedback(String name, String email,Date date,String subject, String message) {
	    super();
	    
	    this.name = name;
	    this.email = email;
	    this.date = date;
	    this.subject = subject;
	    this.message = message;
	    
	}
	
	
}
