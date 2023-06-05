package com.doctorapp.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.doctorap.model.Doctor;
import com.doctorapp.exception.DoctorNotFoundException;

public interface IDoctorRepository {
	void addDoctor(Doctor doctor);
	void updateDoctor(int doctorId,double fees);
	void deleteDoctor(int doctorId);
	Doctor findById(int doctorId) ;
	List<Doctor> findAllDoctors();
	List<Doctor> findBySpeciality(String speciality) ;
	List<Doctor> findBySpecialityAndExp(String speciality,int experience);
	List<Doctor> findBySpecialityAndFees(String speciality,double fees) ;
  List<Doctor> findByAvailability(LocalDateTime startTime);
}
