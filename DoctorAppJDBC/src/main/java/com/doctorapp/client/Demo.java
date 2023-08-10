package com.doctorapp.client;

import java.util.Arrays;
import java.util.List;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

public class Demo {

	public static void main(String[] args) {
		IDoctorService doctorService=new DoctorServiceImpl();
//		List<Doctor>doctor1=Arrays.asList(new Doctor("Sanjay","ortho",304.0,5),
//				new Doctor("Saran","dentist",308.8,10),new Doctor("Hari","Neurologist",308.8,10),new Doctor("Sathya","oncologists",308.8,10));
//		for(Doctor doctor:doctor1) {
//			doctorService.addDoctor(doctor);
//		}
		List <Doctor>doctors=doctorService.getAllDoctors();
	    System.out.println("All Doctors");
	    doctors.forEach(System.out::println);
	    
//	    System.out.println("Update books");
//	    System.out.println("Updated rows :"+doctorService.updateDoctor(30, 310.00));
//			    
//	    doctors=doctorService.getBySpeciality("ortho");
//	    System.out.println("Doctors by speciality");
//	    doctors.forEach(System.out::println);
//	    
//	    doctors=doctorService.getBySpecialityAndExp("ortho",5);
//	    System.out.println("Doctors by speciality and exp");
//	    doctors.forEach(System.out::println);
//	    
//	    doctorService.updateDoctor(31, 400.08);
//	    doctors=doctorService.getBySpecialityAndFees("dentist",308.8);
//	    System.out.println("Doctors by speciality and fees");
//	    doctors.forEach(System.out::println);
//		
	    
	}

}
