package cn.pork.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private int amt;
	private List<Type> types;
	
	public double getTruePrice() {
		return price*rebate;
		
	}
	public void setTruePrice(double truePrice) {
		this.truePrice=truePrice;
	}
}
