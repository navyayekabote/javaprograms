package com.doctorapp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorap.model.Doctor;
import com.doctorapp.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbcApplication.class, args);
	}
	@Autowired
	IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {
//		LocalDateTime starttime=LocalDateTime.of(2022,9,23, 11, 00);
//		LocalDateTime endtime=LocalDateTime.of(2022,9, 23, 05,00);
//		Doctor doctor=new Doctor();
//		doctor.setDoctorName("nandi");
//		doctor.setSpeciality("cardio");
//		doctor.setFees(700);
//		doctor.setExperience(6);
//		doctor.setStartTime(starttime);
//		doctor.setEndTime(endtime);
//		doctorService.addDoctor(doctor);
		
		//update
		//doctorService.updateDoctor(2,890);
		
		//delete
		//doctorService.deleteDoctor(2);
		
		//find all doctors
		doctorService.getAllDoctors()
		.stream()
		.forEach(System.out::println);
		
		//find by id
		//System.out.println(doctorService.getById(1));
		
		//find by speciality
//		doctorService.getBySpeciality("ortho")
//		.stream()
//		.forEach(System.out::println);
//		
//		//find by speciality and experience
//		doctorService.getBySpecialityAndExp("Cardio",7)
//		.stream()
//		.forEach(System.out::println);
//		
//		//find ny speciality and fees
//		doctorService.getBySpecialityAndFees("ortho",500)
//		.stream()
//		.forEach(System.out::println);
//		
		
		
		
	}

}
