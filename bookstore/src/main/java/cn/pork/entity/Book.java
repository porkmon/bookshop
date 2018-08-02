package cn.pork.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Book implements Serializable{
	private String id;
	private String name;
	private double price;
	private double truePrice;
	private String auth;
	private String img;
	private double rebate;
	private int stock;
	private String publisher;
	private Date publishdate;
	private int pages;
	private int size;
	private int printtimes;
	private int versions;
	private String brief;
	private String content;
	private List<Type> types;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public double getRebate() {
		return rebate;
	}
	public void setRebate(double rebate) {
		this.rebate = rebate;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrinttimes() {
		return printtimes;
	}
	public void setPrinttimes(int printtimes) {
		this.printtimes = printtimes;
	}
	public int getVersions() {
		return versions;
	}
	public void setVersions(int versions) {
		this.versions = versions;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", auth=" + auth + ", img=" + img
				+ ", rebate=" + rebate + ", stock=" + stock + ", publisher=" + publisher + ", publishdate="
				+ publishdate + ", pages=" + pages + ", size=" + size + ", printtimes=" + printtimes + ", versions="
				+ versions + ", brief=" + brief + ", content=" + content + "]";
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	public double getTruePrice() {
		return price*rebate;
	}
	public void setTruePrice(double truePrice) {
		this.truePrice = truePrice;
	}
	
	
}
