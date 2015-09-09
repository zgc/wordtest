package com.hxgsn.demo;

public class Test {

	public Test(final String name, final String type, final String date) {
		this.setName(name);
		this.setType(type);
		this.setDate(date);
	}

	private String name;
	private String type;
	private String date;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(final String date) {
		this.date = date;
	}

}
