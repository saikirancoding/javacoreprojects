package com.symbiosis.jpamanytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity  
public class Student {
	
	@Id  
   
    private int sid;  
    private String sname;  
    
    @ManyToMany 
    private List<Book> book_issued;
    
    
    

	public Student() {
		super();
	}

	public Student(int sid, String sname, List<Book> book_issued) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.book_issued = book_issued;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Book> getBook_issued() {
		return book_issued;
	}

	public void setBook_issued(List<Book> book_issued) {
		this.book_issued = book_issued;
	}  
      

}
