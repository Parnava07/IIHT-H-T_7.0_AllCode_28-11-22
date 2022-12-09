package com.DigitalBook.Entity;

import java.util.Date;

public class Books {
	
	private Integer id;
	private String logo;
	private String title;
	private String category;
	private Integer authorID;
	private String authorName;
	private String publisher;
	private Date publishedDate;
	private Boolean isActive;
	private String content;

	public Books() {
		super();
	}

	public Books(Integer id, String logo, String title, String category, Integer authorID, String authorName,
			String publisher, Date publishedDate, Boolean isActive, String content) {
		super();
		this.id = id;
		this.logo = logo;
		this.title = title;
		this.category = category;
		this.authorID = authorID;
		this.authorName = authorName;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.isActive = isActive;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getAuthorID() {
		return authorID;
	}

	public void setAuthorID(Integer authorID) {
		this.authorID = authorID;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Book Details : [id=" + id + ", logo=" + logo + ", title=" + title + ", category=" + category + ", authorID="
				+ authorID + ", authorName=" + authorName + ", publisher=" + publisher + ", publishedDate="
				+ publishedDate + ", isActive=" + isActive + ", content=" + content + "]";
	}
	
	

	
}
