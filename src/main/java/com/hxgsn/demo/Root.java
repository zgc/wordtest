package com.hxgsn.demo;

public class Root {

	public String path() {
		return this.getClass().getClassLoader().getResource("/").getPath();

	}

}
