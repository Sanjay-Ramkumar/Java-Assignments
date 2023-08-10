package com.doctorapp.util;

public class Queries {
	public static final String CREATEQUERY="create table if not exists doctor(doctorName varchar(30) not null,doctorId integer primary key auto_increment,speciality varchar(30) not null,experience int,fees double)";
	public static final String INSERTQUERY="insert into doctor(doctorName,speciality,experience,fees)values(?,?,?,?)";
	public static final String UPDATEQUERY="Update doctor SET fees=? where doctorId=?";
	public static final String DELETEQUERY="Delete from doctor where doctorId=?";
	public static final String QUERYBYDOCTORS="Select * from doctor";
	public static final String QUERYBYSPECIALITY="Select * from doctor where speciality LIKE ?";
	public static final String QUERYBYSPECIALITYANDFEES="Select * from doctor where speciality LIKE ? && fees=?";
	public static final String QUERYBYSPECIALITYANDEXP="Select * from doctor where speciality LIKE ? && experience=?";
	public static final String QUERYBYDOCTORID="Select * from doctor where doctorId=?";
}
