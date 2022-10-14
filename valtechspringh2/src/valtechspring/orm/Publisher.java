package valtechspring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
      private int id;
      private  String name;
      private  String address;
      private int phone_No;
      @OneToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.LAZY,mappedBy="publisher")
      private Set<Book> book;
      
      public Publisher(){
    	  
      }
      
      
	public Publisher(String name, String address, int phone_No) {
		super();
		this.name = name;
		this.address = address;
		this.phone_No = phone_No;
	}
    public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_No() {
		return phone_No;
	}
	public void setPhone_No(int phone_No) {
		this.phone_No = phone_No;
	}
      
      
}
