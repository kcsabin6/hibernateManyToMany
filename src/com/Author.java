package com;

import java.util.Set; 

import javax.persistence.CascadeType;  
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.ManyToMany;  
  
@Entity  
public class Author  
{  
  private Long authorId;  
  private String authorName;  
   // private Set<Book> books;
  Author(){
	  
  }
  
    
  public Author(String authorName) {
	super();
	this.authorName = authorName;
}


@Id  
  @GeneratedValue(strategy=GenerationType.AUTO)  
  @Column(name="author_id")  
  public Long getAuthorId()  
    {  
        return authorId;  
    }  
    public void setAuthorId(Long authorId)  
    {  
        this.authorId = authorId;  
    }  
      
    @Column(name="author_name")  
    public String getAuthorName()  
    {  
        return authorName;  
    }  
    public void setAuthorName(String authorName)  
    {  
        this.authorName = authorName;  
    }  
      
   
    /*public Set<Book> getBooks()  
    {  
        return books;  
    }  
    public void setBooks(Set<Book> books)  
    {  
        this.books = books;  
    }  */
}  
