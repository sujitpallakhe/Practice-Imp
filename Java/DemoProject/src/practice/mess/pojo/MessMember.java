package practice.mess.pojo;

import java.io.Serializable;
import java.time.LocalDate;

public class MessMember implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	private String mobileNumber;
	private MessPlan plan;
	private LocalDate registrationDate;

	public MessMember() {
	}

	public MessMember(int id, String firstName, String lastName, String email, String password, String address,
			String mobileNumber, MessPlan plan, LocalDate registrationDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.plan = plan;
		this.registrationDate = registrationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public MessPlan getPlan() {
		return plan;
	}

	public void setPlan(MessPlan plan) {
		this.plan = plan;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "MessMember [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", address=" + address + ", mobileNumber=" + mobileNumber + ", plan="
				+ plan + ", registrationDate=" + registrationDate + "]";
	}

	@Override
	public int hashCode() {
		int hashVal = this.getAddress().hashCode() + this.getMobileNumber().hashCode();
		return hashVal;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		MessMember mm = (MessMember) obj;
		if(this.getEmail().equals(mm.getEmail()) && this.mobileNumber.equals(mm.mobileNumber)) {
			flag = true;
		}
		
		return flag;
	}

}
