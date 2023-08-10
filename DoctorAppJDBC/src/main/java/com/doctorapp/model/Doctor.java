package com.doctorapp.model;

public class Doctor {
	private String doctorName;
	private String speciality;
	private Integer doctorId;
	private double fees;
	private int experience;
	public Doctor() {
		super();
	}
	public Doctor(String doctorName, String speciality,double fees, int experience) {
		super();
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.fees = fees;
		this.experience = experience;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", speciality=" + speciality + ", doctorId=" + doctorId + ", fees="
				+ fees + ", experience=" + experience + "]";
	}
	
}
