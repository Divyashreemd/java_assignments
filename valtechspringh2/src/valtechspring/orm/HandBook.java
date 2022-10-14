package valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Hb")

public class HandBook extends Book {
	
	private int isbn;
	private float price;
	private String publishedYear;
	private int editions;
	public HandBook(){
		
	}
	public HandBook(int isbn, float price, String publishedYear, int editions) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.publishedYear = publishedYear;
		this.editions = editions;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	public int getEditions() {
		return editions;
	}
	public void setEditions(int editions) {
		this.editions = editions;
	}
	

}
