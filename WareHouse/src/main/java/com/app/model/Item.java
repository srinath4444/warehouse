package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_tab")
public class Item {

	@Id
	@GeneratedValue
	@Column(name="iid")
	private Integer id;
	@Column(name="icode")
	private String code;
	@Column(name="idimensions")
	private String dimensions;
	@Column(name="icost")
	private double cost;
	@Column(name="icurrency")
	private String currency;
	public Item() {
		super();
	}
	public Item(Integer id) {
		super();
		this.id = id;
	}
	public Item(Integer id, String code, String dimensions, double cost, String currency) {
		super();
		this.id = id;
		this.code = code;
		this.dimensions = dimensions;
		this.cost = cost;
		this.currency = currency;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDimensions() {
		return dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", code=" + code + ", dimensions=" + dimensions + ", cost=" + cost + ", currency="
				+ currency + "]";
	}
	
	
	
}
