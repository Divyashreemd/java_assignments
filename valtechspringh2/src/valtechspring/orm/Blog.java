package valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bg")

public class Blog extends Book{
	
	private String url;
	private int visitedNo;
	public Blog(){
		
	}
	
	
	public Blog(String url, int visitedNo) {
		super();
		this.url = url;
		this.visitedNo = visitedNo;
	}


	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getVisitedNo() {
		return visitedNo;
	}
	public void setVisitedNo(int visitedNo) {
		this.visitedNo = visitedNo;
	}
	
	
	

}
