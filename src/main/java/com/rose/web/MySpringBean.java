package com.rose.web;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class MySpringBean {
	private ArrayList<MyData>list=new ArrayList<>();

	public MySpringBean() {
		list.add(new MyData("KenOkuno", "ken.okuno@gmail.com", 22));
		list.add(new MyData("LisaTakahashi", "lisa.takahashi@gmail.com", 24));
		list.add(new MyData("JohhSmith", "john.smith@gmail.com", 25));
		list.add(new MyData("YukoOoshima", "yuko.ooshima@gmail.com", 21));
	}
	
	public MyData getData(int index){
		return list.get(index);
	}
	public void addData(MyData data){
		list.add(data);
	}
	public int size(){
		return list.size();
	}
	
}

class MyData{
	private String name;
	private String mail;
	private int age;
	
	public MyData(String name, String mail, int age) {
		this.name = name;
		this.mail = mail;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "MyData [name=" + name + ", mail=" + mail + ", age=" + age + "]";
	}	
}
