package com.telusko.DemoHibe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

@Entity
@Table(name = "alien_table")
public class Alien {

	@Id
	private int aid;

//	@Transient  //This is not getting stored
	private AlienName aname; // Thatipalli NavinKumarReddy BapReddy

	@Column(name = "alien_color")
	private String color;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public AlienName getAname() {
		return aname;
	}

	public void setAname(AlienName aname) {
		this.aname = aname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

}
