package com.practice.journalApp.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JournalEntry {
	@Id
	private int id;
	private String title;
	private String content;

	public JournalEntry() {}

	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
