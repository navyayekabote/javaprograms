package com.doctorapp.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorDao {
	void addDoctor(Doctor doctor);
	int updateDoctor(int doctorId,double fees);
	Doctor getById(int doctorId) throws DoctorNotFoundException;
	void deleteDoctor(int doctorId);
	List<Doctor> findAllDoctors();
	List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException;
	List<Doctor> findBySpecialityAndExp(String speciality,int experience)throws DoctorNotFoundException;
	List<Doctor> findBySpecialityAndFees(String speciality,double fees) throws DoctorNotFoundException;
  List<Doctor> findByAvailability(LocalDateTime startTime);
}
