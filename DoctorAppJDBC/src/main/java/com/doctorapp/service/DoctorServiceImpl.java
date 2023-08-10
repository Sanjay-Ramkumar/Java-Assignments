package com.doctorapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public class DoctorServiceImpl implements IDoctorService {
	IDoctorDao doctorDao=new DoctorDaoImpl();
	@Override
	public void addDoctor(Doctor doctor) {
		doctorDao.addDoctor(doctor);
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		return doctorDao.updateDoctor(doctorId,fees);
	}

	@Override
	public Doctor getById(int doctorId) {
		if(doctorDao.findById(doctorId)==null) {
			throw new DoctorNotFoundException("Doctors with the given id is not found");
		}
		return doctorDao.findById(doctorId);
	}

	@Override
	public void deleteDoctor(int doctotId) {
		doctorDao.deleteDoctor(doctotId);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorDao.findAllDoctors().stream()
				.sorted((d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName())).collect(Collectors.toList());
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality){
		if(doctorDao.findBySpeciality(speciality).isEmpty()) {
			throw new DoctorNotFoundException("Doctors with the given speciality not found ");
		}
		return doctorDao.findBySpeciality(speciality).stream()
				.sorted((d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName())).collect(Collectors.toList());
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience){
		if(doctorDao.findBySpecialityAndExp(speciality, experience).isEmpty()) {
			throw new DoctorNotFoundException("Doctors not found with given speciality and experience");
		}
		return doctorDao.findBySpecialityAndExp(speciality, experience).stream()
				.sorted((d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName())).collect(Collectors.toList());
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) {
		if(doctorDao.findBySpecialityAndFees(speciality, fees).isEmpty()) {
			throw new DoctorNotFoundException("Doctors not found with given speciality and fees");
		}
		return doctorDao.findBySpecialityAndFees(speciality, fees).stream()
				.sorted((d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName())).collect(Collectors.toList());
	}

}
