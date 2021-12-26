package com.xylem.rajesh;

public class Employee {

		Person p;
		int eid;
		String role;
		String office;
		String laptopModel;
		String headPhone;
		
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
		public String getLaptopModel() {
			return laptopModel;
		}
		public void setLaptopModel(String laptopModel) {
			this.laptopModel = laptopModel;
		}
		public String getHeadPhone() {
			return headPhone;
		}
		public void setHeadPhone(String headPhone) {
			this.headPhone = headPhone;
		}
		@Override
		public String toString() {
			return "Employee [p=" + p + ", eid=" + eid + ", role=" + role + ", office=" + office + ", laptopModel="
					+ laptopModel + ", headPhone=" + headPhone + "]";
		}
	
}
