package com.doctorapp.service;

import java.util.List;

import com.doctorap.model.Doctor;
import com.doctorapp.exception.DoctorNotFoundException;

public interface IDoctorService {
void addDoctor(Doctor doctor);
void updateDoctor(int doctorId,double fees);
void deleteDoctor(int doctorId);
Doctor getById(int doctorId) throws DoctorNotFoundException;
List<Doctor> getAllDoctors();
List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException;
List<Doctor> getBySpecialityAndExp(String speciality,int experience)throws DoctorNotFoundException;
List<Doctor> getBySpecialityAndFees(String speciality,double fees) throws DoctorNotFoundException;

}
