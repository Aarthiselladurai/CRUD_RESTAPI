package com.example.cruds.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String pass;
	
	@Override
	public String toString() {
		return "Bean [id=" + id + ", pass=" + pass + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
