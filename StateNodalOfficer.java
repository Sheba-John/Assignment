package com.example.nsplayer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;

public class StateNodalOfficer {
	
private String StateName;
private String Password;
private String OfficerName;
private int MobileNumber;
private String EmailID;

@OneToMany
Set<Institute> insSet = new HashSet<Institute>();


public Set<Institute> getInsSet() {
	return insSet;
}
public void setInsSet(Set<Institute> insSet) {
	this.insSet = insSet;
}
public String getStateName() {
	return StateName;
}
public void setStateName(String stateName) {
	StateName = stateName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getOfficerName() {
	return OfficerName;
}
public void setOfficerName(String officerName) {
	OfficerName = officerName;
}
public int getMobileNumber() {
	return MobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	MobileNumber = mobileNumber;
}
public String getEmailID() {
	return EmailID;
}
public void setEmailID(String emailID) {
	EmailID = emailID;
}

}
