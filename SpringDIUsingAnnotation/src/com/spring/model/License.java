package com.spring.model;
import org.springframework.stereotype.Component;
@Component
public class License {
	private String number="123456ABC";

	@Override
	public String toString() {
		return "License [number=" + number + "]";
	}

	//setters, getters
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
}
