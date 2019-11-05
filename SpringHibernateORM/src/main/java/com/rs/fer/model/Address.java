package com.rs.fer.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address", catalog="fer_orm")
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(nullable = false)
	@GeneratedValue
	private int id;
	@Column
	private String line1;
	@Column
	private String line2;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private int zip;
	@Column
	private String contry;
	@Column
	private int userid;

	public Address() {
	}

	public Address(String line1, String line2, String street, String city, int zip, String contry,
			int userid) {
		this.line1 = line1;
		this.line2 = line2;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.contry = contry;
		this.userid = userid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getline1() {
		return line1;
	}

	public void setline1(String line1) {
		this.line1 = line1;
	}

	public String getline2() {
		return line2;
	}

	public void setline2(String line2) {
		this.line2 = line2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public int getzip() {
		return zip;
	}

	public void setzip(int zip) {
		this.zip = zip;
	}

	public String getcontry() {
		return contry;
	}

	public void setcontry(String contry) {
		this.contry = contry;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	 
		public String toString() {
			return "User [line1=" + line1 + ", id=" + id + ", line2=" + line2 + " ,street="
					+ street + " ,city=" + city + " ,zip=" + zip
					+ " ,contry=" + contry + " ,userid=" + userid +"]";
}
}
