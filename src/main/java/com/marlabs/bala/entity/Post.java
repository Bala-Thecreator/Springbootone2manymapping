package com.marlabs.bala.entity;

import java.util.*;

import javax.persistence.*;


@Entity
@Table(name ="posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_fid" ,referencedColumnName = "id")
	List<Comment> comments = new ArrayList<>();
	
	public Post()
	{
		
	}
	
	public Post (String title, String description)
	{
		super();
		this.title = title;
		this.description = description;
	}
	
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription()
	{
		this.description = description;
	}
	
	public List<Comment> getComment()
	{
		return comments;
	}
	
	public void setComment(List<Comment> comments)
	{
		this.comments = comments;
	}

}
