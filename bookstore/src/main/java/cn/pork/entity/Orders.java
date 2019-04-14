package cn.pork.entity;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Orders {
	private String id;
	private String userId;
	private String consignee;
	private int paytype;
	private double amt;
	private int state;
	private Date orderdate;
	private List<OrderLine> orderLines;
}
