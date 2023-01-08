package com.symbiosis.jpamanytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Book_issued");  
         EntityManager em=emf.createEntityManager();  
    	
    	 em.getTransaction().begin();  
         
    	 Book b1=new Book(101,"Data Structure",null);  
         Book b2=new Book(102,"DBMS",null);  
         Book b3=new Book(103,"C++",null);
         Book b4=new Book(104,"C++",null);
         
         
         em.persist(b1);  
         em.persist(b2);  
         em.persist(b3); 
         em.persist(b4); 
         
         
         ArrayList<Book> al1=new ArrayList<Book>();  
         ArrayList<Book> al2=new ArrayList<Book>();  
               
         al1.add(b1);  
         al1.add(b2);  
           
         al2.add(b4);  
         al2.add(b3);  
           
         
    	 
         Student st1=new Student(1,"Vipul",al1);  
         Student st2=new Student(2,"Vimal",al2);  
           
         em.persist(st1);  
         em.persist(st2);  
           
           
             
         em.getTransaction().commit();
    	
         System.out.println("Saved data");
    }
}
