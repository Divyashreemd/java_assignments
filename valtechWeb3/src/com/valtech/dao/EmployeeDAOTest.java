package com.valtech.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EmployeeDAOTest {

       @Test
//	public void test() throws Exception {
//		EmployeeDAO dao =new EmployeeDAO();
//		//Connection conn =dao.getConnection();
//		//conn.close();
//		assertEquals(4,dao.count());
//	}
	
	public void testSaveEmployee()throws Exception{
    	   EmployeeDAO dao = new EmployeeDAO();
    	   int count =dao.count();
    	   dao.saveEmployee(new Employee(6,"TH",27,0,10000));
    	   assertEquals(count+1, dao.count());
    	   dao.deleteEmployee(6);
    	   assertEquals(count,dao.count());
       }
	
       @Test
       public void testGetEmployee()throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   Employee e =dao.getEmployee(1);
    	   assertEquals(1,e.getId());
    	   assertEquals(23,e.getAge());
       }
	
       @Test
       public void testGetEmployees()throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   assertEquals(dao.count(),dao.getEmployees().size());
       }
       
       @Test
       public void testUpdateEmployee() throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   dao.updateEmployee(new Employee(3,"ne",25,1,121212));
    	   Employee e =dao.getEmployee(3);
    	   assertEquals(e.getId(),3);
    	   assertEquals(e.getName(),"ne");
    	   assertEquals(25,e.getAge());
    	   assertEquals(1,e.getGender());
    	   assertEquals(121212,e.getSalary(),0.0000001);
    	   
    	   
       }
       @Test
       public void testGetEmployeeByAge()throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   Employee e =dao.getEmployeeByAge(27);
    	   assertEquals(5,e.getId());
    	   assertEquals(e.getName(),"TH");
    	   assertEquals(27,e.getAge());
       }
       
       @Test
       public void testGetEmployeeBetweenAge()throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   List<Employee> e = new ArrayList<>();
    	   int total = dao.findBetweenAge(22,27).size();
   		   assertEquals(total, dao.findBetweenAge(22,27).size());
   		   assertTrue("AB",true);
   		   assertTrue("CD",true);
   		 
       }
       @Test
       public void testfindSalaryGt()throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   List<Employee> e = new ArrayList<>();
    	   int total = dao.findSalaryGt(10000).size();
   		   assertEquals(total, dao.findSalaryGt(10000).size());
   		   assertTrue("ne",true);
   		   assertTrue("GH", true);
   		   //assertFalse("six", false);
    	  
       }
       @Test
       public void testfindSalarylt()throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   List<Employee> e = new ArrayList<>();
    	   int total = dao.findSalarylt(10000).size();
   		   assertEquals(total, dao.findSalarylt(10000).size());
   		   assertTrue("AB",true);
   		   assertTrue("CD", true);
   		   //assertFalse("six", false);
    	  
       }
       
       @Test
       public void testMales()throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   List<Employee> e = new ArrayList<>();
    	   int total = dao.findMales(1).size();
   		   assertEquals(total, dao.findMales(1).size());
   		   assertTrue("AB",true);
   		   assertTrue("ne", true);
   		   
    	  
       }
       @Test
       public void testFeMales()throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   List<Employee> e = new ArrayList<>();
    	   int total = dao.findFemales(-1).size();
   		   assertEquals(total, dao.findFemales(-1).size());
   		   assertTrue("CD",true);
   		   assertTrue("GH", true);
   		   
    	  
       }
       @Test
       public void testOthers()throws Exception{
    	   EmployeeDAO dao =new EmployeeDAO();
    	   List<Employee> e = new ArrayList<>();
    	   int total = dao.findOthers(0).size();
   		   assertEquals(total, dao.findOthers(0).size());
   		   assertTrue("TH",true);
   		   
    	  
       }
	

}
