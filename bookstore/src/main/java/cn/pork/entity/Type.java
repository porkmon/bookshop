package cn.pork.entity;

import java.io.Serializable;
import java.util.List;

public class Type implements Serializable{
	private String id;
	private String name;
	private String descr;
	private List<Book> books;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", name=" + name + ", descr=" + descr + "]";
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	

}
