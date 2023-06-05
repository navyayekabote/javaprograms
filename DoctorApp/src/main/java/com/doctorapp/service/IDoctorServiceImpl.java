package com.doctorapp.service;

import java.util.List;

import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public class IDoctorServiceImpl implements IDoctorService{

	IDoctorDao doctorDao=new DoctorDaoImpl();
	@Override
	public void addDoctor(Doctor doctor) {
		doctorDao.addDoctor(doctor);
		
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		int result=doctorDao.updateDoctor(doctorId, fees);
		if(result==0)
			throw new ArithmeticException();
		return result;
	}

	@Override
	public Doctor getById(int doctorId) throws DoctorNotFoundException {
		Doctor doctor=doctorDao.getById(doctorId);
		return doctor;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		doctorDao.deleteDoctor(doctorId);
		
	}

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctors=doctorDao.findAllDoctors();
		return doctors;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctorsBySpeciality=doctorDao.findBySpeciality(speciality);
		return doctorsBySpeciality;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctors=doctorDao.findBySpecialityAndExp(speciality, experience);
		return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctors=doctorDao.findBySpecialityAndFees(speciality, fees);
		return doctors;
		
	}

	
}
