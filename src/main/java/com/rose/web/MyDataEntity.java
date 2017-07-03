package com.rose.web;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyDataEntity {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String mail;
	public MyDataEntity(){}
	public MyDataEntity(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "MyDataEntity [ name=" + name + ", mail=" + mail + "]";
	}
	
}
