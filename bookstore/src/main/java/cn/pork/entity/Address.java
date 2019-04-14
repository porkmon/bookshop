package cn.pork.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Address {
	private String id;
	private String name;
	private int phone;
	private int zip;
	private int dft;
	private String userId;
	private Date mktime;
}
