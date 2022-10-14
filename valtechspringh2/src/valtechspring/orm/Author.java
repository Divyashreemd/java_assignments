package valtechspring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private int phone_No;
	
	@OneToOne(targetEntity=Author_Address.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="author")
	private Author_Address authoraddress;
	@ManyToMany(targetEntity = Book.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, mappedBy = "authors")
	private Set<Book> books;
	
	public Author() {

	}

	public Author(String name, int phone_No) {
		super();
		this.name = name;
		this.phone_No = phone_No;
	}
//
	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
//
	
	public Author_Address getAuthoraddress() {
		return authoraddress;
	}
	public void setAuthoraddress(Author_Address authoraddress) {
		this.authoraddress = authoraddress;
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

	public int getPhone_No() {
		return phone_No;
	}

	public void setPhone_No(int phone_No) {
		this.phone_No = phone_No;
	}

}
