package com.rs.fer.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense", catalog="fer_orm")
public class Expense implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable = false)
	@GeneratedValue
	private int id;
	@Column
	private String type;
	@Column
	private String date;
	@Column
	private float price;
	@Column
	private int numberofitems;
	@Column
	private float total;
	@Column
	private String bywhom;
	@Column
	private int userid;

	public Expense() {
	}
	public Expense(String type, String date, float price, int numberofitems, float total, int userid ) {
		this.type = type;
		this.date = date;
		this.price = price;
		this.numberofitems = numberofitems;
		this.total = total;
		this.userid = userid;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gettype() {
		return this.type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNumberofitems() {
		return this.numberofitems;
	}

	public void setNumberofitems(int numberofitems) {
		this.numberofitems = numberofitems;
	}

	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getBywhom() {
		return this.bywhom;
	}

	public void setBywhom(String bywhom) {
		this.bywhom = bywhom;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ",type=" + type + ", date=" + date + ", price=" + price
				+ ", noumberofitems=" + numberofitems + ", total=" + total + ", bywhom=" + bywhom + ", userid=" + userid
				+ "]";
	}

}
