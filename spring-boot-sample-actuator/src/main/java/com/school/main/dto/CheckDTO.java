package com.school.main.dto;

import java.io.Serializable;

public class CheckDTO implements Serializable {
	private int id;
	private String name;
	private String address;
	private String mobNumber;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
}
