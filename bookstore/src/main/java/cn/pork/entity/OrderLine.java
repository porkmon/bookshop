package cn.pork.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderLine {
	private String id;
	private String orderId;
	private String bookId;
	private int amt;
	private double price;
	private String bookName;
}
