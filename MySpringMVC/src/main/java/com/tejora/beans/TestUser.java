package com.tejora.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TESTUSER")
public class TestUser
{
	@Id
	@Column(name="Id")
	@GeneratedValue
	private int id;
	
	@Column(name="UNAME")
	private String Uname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}
	
	
	
}
