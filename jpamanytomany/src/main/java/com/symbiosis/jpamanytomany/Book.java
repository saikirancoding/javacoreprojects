package com.symbiosis.jpamanytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	
	@Id
	
	private int bid;
	private String bname;
	
	@ManyToMany(mappedBy="book_issued")
	private List<Student> stud;

	
	
	public Book() {
		super();
	}



	public Book(int bid, String bname, List<Student> stud) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.stud = stud;
	}

	
	
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public List<Student> getStud() {
		return stud;
	}

	public void setStud(List<Student> stud) {
		this.stud = stud;
	}  
	
	
	
	
}
