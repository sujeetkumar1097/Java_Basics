package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
//@Scope("prototype")
public class Laptop {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lapId;
	private String lapName;
	private String color;

	public Laptop() {
		// TODO Auto-generated constructor stub
		System.out.println("laptop object init");
	}

	public Laptop(int lapId, String lapName, String color) {
		super();
		this.lapId = lapId;
		this.lapName = lapName;
		this.color = color;
	}

	public int getLapId() {
		return lapId;
	}

	public void setLapId(int lapId) {
		this.lapId = lapId;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.println("laptop object printing");
	}

	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", lapName=" + lapName + ", color=" + color + "]";
	}

}
