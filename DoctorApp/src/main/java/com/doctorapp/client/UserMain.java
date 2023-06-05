package com.doctorapp.client;

import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;
import com.doctorapp.service.IDoctorServiceImpl;

public class UserMain {

	public static void main(String[] args) {
		IDoctorService doctorservice=new IDoctorServiceImpl();
		try {
			System.out.println("doctor by id");
		Doctor doctorById=doctorservice.getById(3);
		System.out.println(doctorById);
//		System.out.println("doctors by speciality");
//		List<Doctor> doctors=doctorservice.getBySpeciality("ortho");
//		for(Doctor doctor:doctors)
//		{
//			System.out.println(doctor);
//		}
//		System.out.println("doctors by speciality and fees");
//		List<Doctor> doctorsBySpeciality=doctorservice.getBySpeciality("ortho");
//		for(Doctor doctor:doctorsBySpeciality)
//		{
//			System.out.println(doctor);
//		}
		}catch(DoctorNotFoundException e)
		{
			e.getMessage();
		}
		

	}

}
