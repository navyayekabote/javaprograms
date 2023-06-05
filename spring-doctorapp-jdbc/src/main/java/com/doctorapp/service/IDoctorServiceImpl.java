package com.doctorapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.doctorap.model.Doctor;
import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.repository.IDoctorRepository;
@Service
public class IDoctorServiceImpl implements IDoctorService{
	IDoctorRepository doctorRepository;
	
	

	public IDoctorServiceImpl(IDoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}
	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepository.addDoctor(doctor);
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		doctorRepository.updateDoctor(doctorId, fees);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		doctorRepository.deleteDoctor(doctorId);
		
	}

	@Override
	public Doctor getById(int doctorId) throws DoctorNotFoundException {
		Doctor doctor=doctorRepository.findById(doctorId);
		if(doctor==null)
		{
			throw new DoctorNotFoundException("doctor not found with that id");
		}
		return doctor;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctors=doctorRepository.findAllDoctors();
		return doctors;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctors=doctorRepository.findBySpeciality(speciality);
		if(doctors.isEmpty())
		{
			throw new DoctorNotFoundException("doctor not found with that speciality");
		}
		return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctors=doctorRepository.findBySpecialityAndExp(speciality, experience);
		if(doctors.isEmpty())
		{
			throw new DoctorNotFoundException("doctor not found with that speciality and experience");
		}
		return doctors;	
		}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctors=doctorRepository.findBySpecialityAndFees(speciality, fees);
		if(doctors.isEmpty())
		{
			throw new DoctorNotFoundException("doctor not found with that speciality and fees");
		}
		return doctors;
	}

	
	
}
