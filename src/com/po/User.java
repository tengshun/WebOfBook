package com.po;

import java.sql.Date;

public class User {
private int id;
private String username;
private String email;
private String password;
private String phone;
private int nationorregion;
private int gender;
private Date birthday;
private int level;
private String school;
private String major;
private String motto;
private String introdution;
private String setting;
private Date createtime;
public int getId() {
	return id;
}
public String getUsername() {
	return username;
}
public String getEmail() {
	return email;
}
public String getPassword() {
	return password;
}
public String getPhone() {
	return phone;
}
public int getNationorregion() {
	return nationorregion;
}
public int getGender() {
	return gender;
}
public Date getBirthday() {
	return birthday;
}
public int getLevel() {
	return level;
}
public String getSchool() {
	return school;
}
public String getMajor() {
	return major;
}
public String getMotto() {
	return motto;
}
public String getIntrodution() {
	return introdution;
}
public String getSetting() {
	return setting;
}
public Date getCreatetime() {
	return createtime;
}
public void setId(int id) {
	this.id = id;
}
public void setUsername(String username) {
	this.username = username;
}
public void setEmail(String email) {
	this.email = email;
}
public void setPassword(String password) {
	this.password = password;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public void setNationorregion(int nationorregion) {
	this.nationorregion = nationorregion;
}
public void setGender(int gender) {
	this.gender = gender;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public void setLevel(int level) {
	this.level = level;
}
public void setSchool(String school) {
	this.school = school;
}
public void setMajor(String major) {
	this.major = major;
}
public void setMotto(String motto) {
	this.motto = motto;
}
public void setIntrodution(String introdution) {
	this.introdution = introdution;
}
public void setSetting(String setting) {
	this.setting = setting;
}
public void setCreatetime(Date createtime) {
	this.createtime = createtime;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", phone="
			+ phone + ", nationorregion=" + nationorregion + ", gender=" + gender + ", birthday=" + birthday
			+ ", level=" + level + ", school=" + school + ", major=" + major + ", motto=" + motto + ", introdution="
			+ introdution + ", setting=" + setting + ", createtime=" + createtime + "]";
}
}
