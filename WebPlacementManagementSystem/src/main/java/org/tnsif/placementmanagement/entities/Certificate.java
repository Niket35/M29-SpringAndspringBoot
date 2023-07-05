package org.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	@Id
	private int id;
	private int year;
	public Certificate() {
		System.out.println("Demonstration on SpringBoot-REST API");
	}
	public Certificate(int id, int year) {
		super();
		this.id = id;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + "]";
	}
	

}
