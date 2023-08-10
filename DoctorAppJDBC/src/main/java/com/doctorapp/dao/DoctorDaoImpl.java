package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DBConnection;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl implements IDoctorDao {

	@Override
	public void addDoctor(Doctor doctor) {
		try(Connection connection=DBConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
			statement.setString(1,doctor.getDoctorName());
			statement.setString(2, doctor.getSpeciality());
			statement.setInt(3, doctor.getExperience());
			statement.setDouble(4, doctor.getFees());
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		int result = 0;
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);) {
				statement.setDouble(1, fees);
				statement.setInt(2, doctorId);
				result =statement.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public Doctor findById(int doctorId) throws DoctorNotFoundException{
		Doctor doctor = null;
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYDOCTORID);) {
			statement.setInt(1, doctorId);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				doctor = new Doctor();
				doctor.setDoctorName(result.getString(1));
				doctor.setSpeciality(result.getString(3));
				doctor.setExperience(result.getInt(4));
				doctor.setFees(result.getDouble(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return doctor;
	}

	@Override
	public void deleteDoctor(int doctortId) {
		try(Connection connection=DBConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement(Queries.DELETEQUERY);){
			statement.setInt(1, doctortId);
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Doctor> findAllDoctors(){
		List<Doctor>doctors=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYDOCTORS);){	
			ResultSet result=statement.executeQuery();
			while(result.next()) {
				Doctor doctor=new Doctor();
				doctor.setDoctorName(result.getString(1));
				doctor.setDoctorId(result.getInt(2));
				doctor.setSpeciality(result.getString(3));
				doctor.setExperience(result.getInt(4));
				doctor.setFees(result.getDouble(5));
				doctors.add(doctor);
			}
		}catch(Exception e) {
				e.printStackTrace();
			}
		return doctors;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor>doctors=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYSPECIALITY);){
			statement.setString(1, "%"+speciality+"%");	
			ResultSet result=statement.executeQuery();
			while(result.next()) {
				Doctor doctor=new Doctor();
				doctor.setDoctorName(result.getString(1));
				doctor.setDoctorId(result.getInt(2));
				doctor.setSpeciality(result.getString(3));
				doctor.setExperience(result.getInt(4));
				doctor.setFees(result.getDouble(5));
				doctors.add(doctor);
			}
		}catch(Exception e) {
				e.printStackTrace();
			}
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor>doctors=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYSPECIALITYANDEXP);){
			statement.setString(1, "%"+speciality+"%");	
			statement.setInt(2, experience);
			ResultSet result=statement.executeQuery();
			while(result.next()) {
				Doctor doctor=new Doctor();
				doctor.setDoctorName(result.getString(1));
				doctor.setDoctorId(result.getInt(2));
				doctor.setSpeciality(result.getString(3));
				doctor.setExperience(result.getInt(4));
				doctor.setFees(result.getDouble(5));
				doctors.add(doctor);
			}
		}catch(Exception e) {
				e.printStackTrace();
			}
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor>doctors=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYSPECIALITYANDFEES);){
			statement.setString(1, "%"+speciality+"%");	
			statement.setDouble(2, fees);
			ResultSet result=statement.executeQuery();
			while(result.next()) {
				Doctor doctor=new Doctor();
				doctor.setDoctorName(result.getString(1));
				doctor.setDoctorId(result.getInt(2));
				doctor.setSpeciality(result.getString(3));
				doctor.setExperience(result.getInt(4));
				doctor.setFees(result.getDouble(5));
				doctors.add(doctor);
			}
		}catch(Exception e) {
				e.printStackTrace();
			}
		return doctors;
	}

}
