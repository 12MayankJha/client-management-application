package com.jhaFinancial.ClientApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Client {
	
	@Id
	String id;
	
	@Field("NAME")
	String name;
	@Field("FATHER'S / SPOUSE NAME")
	String fathersorSpouseName;
	@Field("MOTHER'S NAME")
	String motherName;
	@Field("MARITAL STATUS")
	String maritalStatus;
	@Field("DATE OF BIRTH")
	String dateOfBirth;
	@Field("PAN NUMBER")
	String panNumber;
	@Field("ADHAAR NUMBER")
	String adhaarNumber;
	@Field("OCCUPATION")
	String occupation;
	@Field("ANNUAL INCOME")
	String annualIncome;
	@Field("NOMINEE")
	String nominee;
	@Field("MOBILE NUMBER")
	String mobileNumber;
	@Field("EMAIL")
	String email;
	@Field("ADDRESS")
	String address;
	@Field("INVESTMENT")
	String investment;
	@Field("IMAGE")
	String image;
	@Field("DOCUMENTS")
	String documents;

	/**
	 * @param id
	 * @param name
	 * @param fathersorSpouseName
	 * @param motherName
	 * @param maritalStatus
	 * @param dateOfBirth
	 * @param panNumber
	 * @param adhaarNumber
	 * @param occupation
	 * @param annualIncome
	 * @param nominee
	 * @param mobileNumber
	 * @param email
	 * @param address
	 * @param investment
	 * @param image
	 * @param documents
	 */
	public Client(String name, String fathersorSpouseName, String motherName, String maritalStatus, String dateOfBirth,
			String panNumber, String adhaarNumber, String occupation, String annualIncome, String nominee,
			String mobileNumber, String email, String address, String investment, String image, String documents) {
		super();
		this.name = name;
		this.fathersorSpouseName = fathersorSpouseName;
		this.motherName = motherName;
		this.maritalStatus = maritalStatus;
		this.dateOfBirth = dateOfBirth;
		this.panNumber = panNumber;
		this.adhaarNumber = adhaarNumber;
		this.occupation = occupation;
		this.annualIncome = annualIncome;
		this.nominee = nominee;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
		this.investment = investment;
		this.image = image;
		this.documents = documents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathersorSpouseName() {
		return fathersorSpouseName;
	}

	public void setFathersorSpouseName(String fathersorSpouseName) {
		this.fathersorSpouseName = fathersorSpouseName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(String adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "name=" + name + ", fathersorSpouseName=" + fathersorSpouseName + ", motherName=" + motherName
				+ ", maritalStatus=" + maritalStatus + ", dateOfBirth=" + dateOfBirth + ", panNumber=" + panNumber
				+ ", adhaarNumber=" + adhaarNumber + ", occupation=" + occupation + ", annualIncome=" + annualIncome
				+ ", nominee=" + nominee + ", mobileNumber=" + mobileNumber + ", email=" + email + ", address="
				+ address + ", investment=" + investment + ", image=" + image + ", documents=" + documents + "]";
	}

}
