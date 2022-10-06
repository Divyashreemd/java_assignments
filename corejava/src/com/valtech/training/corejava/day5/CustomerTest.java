package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class CustomerTest {
	
	
    
    //Customer cu= new Customer();
	
	int Diamond=4;
	int Platinum =3;
	int gold=2;
	int silver=1;
	@Test
	public void test() throws Exception {
		// SimpleDateFormat df =new SimpleDateFormat("dd-MM-yyyy");
		Set<Customer> customer= new TreeSet<Customer>();
		
		Customer cus1= new Customer("deepa",Diamond,"2001-09-25",23000);
		Customer cus2= new Customer("pqrst",Platinum,"2001-09-13",23000);
  	    Customer cus3= new Customer("mnop",Diamond,"2001-08-25",5400);
        Customer cus4= new Customer("bhuvan",Platinum,"2001-09-10",54000);
        Customer cus5= new Customer("world",gold,"2001-10-14",5400);
        Customer cus6= new Customer("jeevan",silver,"2001-10-13",5400);
        Customer cus7= new Customer("rfen",Diamond,"2000-11-25",5400);
        
		
		customer.add(cus1);
		customer.add(cus2);
  	    customer.add(cus3);
  	    customer.add(cus4);
  	    customer.add(cus5);
  	    customer.add(cus6);
  	  customer.add(cus7);
  	    
  	    
		
		 System.out.println(customer.size());
		for(Customer c : customer) {
			System.out.println(c.name+" "+convert_to_string(c.type)+" "+c.date+" "+c.moneyspent);
		}
		
//		 LocalDate currdate1= LocalDate.parse("2001-09-25");
//		   int month1= currdate1.getMonthValue();
//		   int year1=currdate1.getYear();
//		   System.out.println(month1);
//		   System.out.println(year1);
			
		
		
	}
	
	public String convert_to_string (int t1) {
		switch (t1) {
		case 1:
			  return "Silver";
		
		case 2:
			  return "Gold";
		
		case 3:
			  return "Paltinum";
			
		case 4:
			  return "Diamond";
			

		default:
			return "0";
		
		}
	}

}
