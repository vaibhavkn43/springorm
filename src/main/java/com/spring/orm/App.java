package com.spring.orm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	@Autowired
	StudentDao studentDao;
	
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao=  context.getBean("studentDao" , StudentDao.class);
       
       
		/*
		 * Student student=new Student(101,"Vaibhav Kalyankar","Pune" ); int r=
		 * studentDao.insert(student); System.out.println("Done"+ r);
		 */
   
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       Scanner sc= new Scanner(System.in);
       
       System.out.println("************WELCOME TO SPRING ORM PROJECT***************");
       
       
       boolean go =true;
       while(go)
       {
    	   
    	   System.out.println("PRESS 1 for add new Student");
           System.out.println("PRESS 2 for display all Student");
           System.out.println("PRESS 3 for get details of single Student");
           System.out.println("PRESS 4 for delete Student");
           System.out.println("PRESS 5 for update Student");
           System.out.println("PRESS 6 for exit");
           
           
           
    	   try {
    		   
    		int input=   Integer.parseInt(br.readLine());
			
//    		if(input==1)
//    		{
//    			//add new student
//    		}
//    		else if (input == 2) {
//				//dispaly all student
//			}    		
    		
    		switch(input)
    		{
    		
    		case 1:
    			//add new student
    			System.out.println("Enter Student Id:");
    			int id=	sc.nextInt();
    			System.out.println("Enter Student Name:");
    		    String name=sc.next();
    		    System.out.println("Enter Student City:");
    		    String city=sc.next();
    		    Student student = new Student(id,name,city);
    			
    			studentDao.insert(student);
    			
    			System.out.println("Student Details Has Been Saved...!!!");
    			break;
    		case 2:
    			// dispaly all students
    			break;
    		case 3:
    			//get details of single Student
    			break;
    		case 4:
    			//delete student record
    			break;
    		case 5:
    			//update Student record
    			break;
    		case 6:
    			//exit
    			go=false;
    			break;
    		
    		}
    		
    		
		} catch (Exception e) {
			System.out.println("Invalid input Try with other option");
			System.out.println(e.getMessage());
		}
    	   System.out.println("Thank You for Using My Application");
       }
       
    }
}
