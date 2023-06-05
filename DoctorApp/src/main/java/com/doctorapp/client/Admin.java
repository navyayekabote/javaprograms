package com.doctorapp.client;

import java.time.LocalDateTime;
import java.util.List;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;
import com.doctorapp.service.IDoctorServiceImpl;

public class Admin {

	public static void main(String[] args) {
		IDoctorService doctorservice=new IDoctorServiceImpl();
		LocalDateTime startDate=LocalDateTime.of(2022,9,23, 11, 00);
		LocalDateTime endTime=LocalDateTime.of(2022,9, 23, 05,00);
	   /*Inserting values */
//	     Doctor doctor=new Doctor();
//		doctor.setDoctorId(9);
//		doctor.setDoctorName("sowmya");
//		doctor.setExperience(7);
//		doctor.setFees(700);
//		doctor.setSpeciality("Dermatologist");
//		doctor.setStartTime(startDate);
//		doctor.setEndTime(endTime);
		
//		doctorservice.addDoctor(doctor);
		
		/*updating doctor
		doctorservice.updateDoctor(7,500);*/
		
		/*deleting doctor
		 doctorservice.deleteDoctor(7);*/
		
		List<Doctor> doctorList=doctorservice.getAllDoctors();
		for(Doctor doc:doctorList)
			System.out.println(doc);
		
	}

}
