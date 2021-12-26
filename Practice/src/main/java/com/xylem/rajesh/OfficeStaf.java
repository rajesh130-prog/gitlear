package com.xylem.rajesh;

public class OfficeStaf {
	Person p;
	int eid;
	String role;
	String office;
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	@Override
	public String toString() {
		return "OfficeStaf [p=" + p + ", eid=" + eid + ", role=" + role + ", office=" + office + "]";
	}
	

}
