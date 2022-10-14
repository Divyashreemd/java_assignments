package valtechspring.client;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import valtechspring.orm.Article;
import valtechspring.orm.Author;
import valtechspring.orm.Blog;
import valtechspring.orm.Book;
import valtechspring.orm.Author_Address;
import valtechspring.orm.HandBook;
import valtechspring.orm.Publisher;

public class HibernateBook {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure()
				.addAnnotatedClass(Book.class).addAnnotatedClass(Article.class)
				.addAnnotatedClass(Blog.class).addAnnotatedClass(HandBook.class).addAnnotatedClass(Publisher.class)
				.addAnnotatedClass(Author.class).addAnnotatedClass(Author_Address.class)
				.buildSessionFactory();
		Session  ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		
//		
		 ses.save(new Book("book1", new Date(90, 5, 13)));
		 ses.save(new Article("http://article1.com") );
		 ses.save(new  Blog("http://Blog1.com",2));
	     ses.save(new  HandBook(1,1000,"2001",5));
		 ses.save(new Publisher("abc","bangalore",123456));
//		Book b2 = new Book("di", new Date(90,5,13));
//		ses.save(b2);
		Publisher p1= new Publisher("pqr", "bangalore", 123456);
		ses.save(p1);
//		Publisher p1 = (Publisher) ses.load(Publisher.class, 220);
//		b2.setPublisher(p1);
//		ses.save(b2);
//		
		 
//         ses.save(new Author("xyz",123456));
//		 ses.save(new Author_Address("JP Nagar","Bangalore","Karnataka",562109));
//		 
		 Author a1 = new Author("xyz",123456);
		 ses.save(a1);
		 Author_Address a2 = new Author_Address("JP Nagar","Bangalore","Karnataka",562109);
		 ses.save(a2);
		 a1.setAuthoraddress(a2);
		 a2.setAuthor(a1);
		
		tx.commit();
		ses.close();
		sf.close();
		
		
	}

}
