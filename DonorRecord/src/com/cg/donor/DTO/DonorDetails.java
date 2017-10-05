package com.cg.donor.DTO;

import java.time.LocalDate;

public class DonorDetails {

	private String donor_id;
	private String donor_name;
	private String phoneno;
	private String address;
	private int donation_amount;
	private LocalDate donation_date;
	
	public DonorDetails(){
		
	}
	
	
	@Override
	public String toString() {
		return "Donor [donor_id=" + donor_id + ", donor_name=" + donor_name
				+ ", phoneno=" + phoneno + ", address=" + address
				+ ", donation_amount=" + donation_amount + ", donation_date="
				+ donation_date + "]";
	}


	public String getDonor_id() {
		return donor_id;
	}
	public DonorDetails(String donor_name, String phoneno, String address,
			int donation_amount) {
		super();
		this.donor_name = donor_name;
		this.phoneno = phoneno;
		this.address = address;
		this.donation_amount = donation_amount;
	}


	public void setDonor_id(String donor_id) {
		this.donor_id = donor_id;
	}
	public String getDonor_name() {
		return donor_name;
	}
	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDonation_amount() {
		return donation_amount;
	}
	public void setDonation_amount(int donation_amount) {
		this.donation_amount = donation_amount;
	}
	public LocalDate getDonation_date() {
		return donation_date;
	}
	public void setDonation_date(LocalDate donation_date) {
		this.donation_date = donation_date;
	}
}
