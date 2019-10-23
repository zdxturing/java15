package com.turing.mybaits.entity;

public class Staff {

	private int id;
	private String name;
	private double money;
	private String site;
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
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", money=" + money + ", site=" + site + "]";
	}
}
