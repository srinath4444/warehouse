package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shiptab")
public class ShipmentType {
@Id
@GeneratedValue
@Column(name="id")	
private Integer id;
@Column(name="mode")
private String mode;
@Column(name="code")
private String code;
@Column(name="enabled")
private String enabled;
@Column(name="grade")
private String grade;
@Column(name="dsc")
private String dsc;
public ShipmentType() {
	super();
}
public ShipmentType(Integer id) {
	super();
	this.id = id;
}
public ShipmentType(Integer id, String mode, String code, String enabled, String grade, String dsc) {
	super();
	this.id = id;
	this.mode = mode;
	this.code = code;
	this.enabled = enabled;
	this.grade = grade;
	this.dsc = dsc;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getEnabled() {
	return enabled;
}
public void setEnabled(String enabled) {
	this.enabled = enabled;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getDsc() {
	return dsc;
}
public void setDsc(String dsc) {
	this.dsc = dsc;
}
@Override
public String toString() {
	return "ShipmentType [id=" + id + ", mode=" + mode + ", code=" + code + ", enabled=" + enabled + ", grade=" + grade
			+ ", dsc=" + dsc + "]";
}


}
