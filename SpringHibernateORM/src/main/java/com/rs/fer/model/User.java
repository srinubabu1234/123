package com.rs.fer.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rs.fer.model.Address;
import com.rs.fer.model.Expense;

@Entity
@Table(name="user", catalog="fer_orm")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable=false)
	@GeneratedValue
	private int id;
	@Column
	private String firstname;
	@Column
	private String middlename;
	@Column
	private String lastname;
	@Column
	private String email;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String mobilenumber;
	
	
	  @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	 
	 @JoinColumn(name="userid", referencedColumnName="id") private Set<Expense>
	  expenses;
	 
	 /* @OneToOne( cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="userid", referencedColumnName="id")
	 * 
	 * private Address address;
	 */
	 
	public User() {
	}

	public User(String firstname, String middlename, String lastname, String email, String username, String password,
			String mobilenumber) {
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.mobilenumber = mobilenumber;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobilenumber() {
		return this.mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	
	  public Set<Expense> getExpenses() { return this.expenses; } public void
	  setExpenses(Set<Expense> expenses) { this.expenses=expenses; }
	  
	  
	 /* public Address getAddress() { return this.address; }
	 * 
	 * public void setAddress(Address address) { this.address = address; }
	 */
	public String toString() {
		return "User [firstname=" + firstname + ", id=" + id + ", middlename=" + middlename + " ,lastname="
				+ lastname + " ,email=" + email + " ,username=" + username + " ,password=" + password
				+ " ,mobilenumber=" + mobilenumber + "]";
		
	}
}

