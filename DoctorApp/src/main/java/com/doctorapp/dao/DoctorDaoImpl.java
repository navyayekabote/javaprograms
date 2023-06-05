package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DbConnection;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl implements IDoctorDao{

	
	@Override
	public void addDoctor(Doctor doctor) {
		Connection connection;
		try {
			connection=DbConnection.openConnection();
		PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);
		statement.setString(1,doctor.getDoctorName());
		statement.setInt(2,doctor.getDoctorId());
		statement.setString(3,doctor.getSpeciality());
		statement.setInt(4,doctor.getExperience());
		statement.setDouble(5,doctor.getFees());
		statement.setTimestamp(6,Timestamp.valueOf(doctor.getStartTime()));
		statement.setTimestamp(7,Timestamp.valueOf(doctor.getEndTime()));
		statement.execute();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			DbConnection.closeConnection();
		}
		
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		Connection connection;
		int result=0;
		try {
			connection=DbConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);
			statement.setDouble(1,fees);
			statement.setInt(2, doctorId);
			result=statement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			DbConnection.closeConnection();
		}
		return result;
	}

	@Override
	public Doctor getById(int doctorId) throws DoctorNotFoundException {
		Connection connection;
		Doctor doctor=null;
		try {
			connection=DbConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement("select * from doctor where doctorId=?");
			statement.setInt(1, doctorId);
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				String doctorname=rs.getString("doctorName");
				int doctorid=rs.getInt("doctorId");
				String speciality=rs.getString("speciality");
				int experience=rs.getInt("experience");
				double fees=rs.getDouble("fees");
				LocalDateTime startdate= rs.getTimestamp("startDate").toLocalDateTime();
				System.out.println(startdate);
				LocalDateTime endtime=rs.getTimestamp("endTime").toLocalDateTime();
				doctor=new Doctor(doctorname,doctorid,speciality,fees,experience,startdate,endtime);
				 
			}
		}catch(SQLException e)
			{
				e.printStackTrace();
			}finally
			{
				DbConnection.closeConnection();
			}
			
		return doctor;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		Connection connection;
		try {
			connection=DbConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement(Queries.DELETEQUERY);
			statement.setInt(1, doctorId);
			statement.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			DbConnection.closeConnection();
		}
	}

	@Override
	public List<Doctor> findAllDoctors() {
		List<Doctor> doctors=new ArrayList<>();
		List<Doctor> doctorsByAll=new ArrayList<>();;
		Connection connection;
		try {
			connection=DbConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement("select * from doctor");
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				String doctorname=rs.getString("doctorName");
				int doctorid=rs.getInt("doctorId");
				String speciality=rs.getString("speciality");
				int experience=rs.getInt("experience");
				double fees=rs.getDouble("fees");
				LocalDateTime startdate= rs.getTimestamp("startDate").toLocalDateTime();
				LocalDateTime endtime=rs.getTimestamp("endTime").toLocalDateTime();

				Doctor doctor=new Doctor(doctorname,doctorid,speciality,fees,experience,startdate,endtime);
				 doctors.add(doctor);
			}
			doctorsByAll=doctors.stream()
					.sorted((o1,o2)->o1.getDoctorName().compareTo(o2.getDoctorName()))
					.collect(Collectors.toList());
		}catch(SQLException e)
			{
				e.printStackTrace();
			}finally
			{
				DbConnection.closeConnection();
			}
			
		return doctorsByAll;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctors=new ArrayList<>();
		List<Doctor> doctorsBySpeciality=new ArrayList<>();
		Connection connection;
		try {
			connection=DbConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement("select * from doctor where speciality=?");
			statement.setString(1, speciality);
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				String doctorname=rs.getString("doctorName");
				int doctorid=rs.getInt("doctorId");
				String speciality1=rs.getString("speciality");
				int experience=rs.getInt("experience");
				double fees=rs.getDouble("fees");
				LocalDateTime startdate= rs.getTimestamp("startDate").toLocalDateTime();
				LocalDateTime endtime=rs.getTimestamp("endTime").toLocalDateTime();

				Doctor doctor=new Doctor(doctorname,doctorid,speciality1,fees,experience,startdate,endtime);
				 doctors.add(doctor);
			}
			doctorsBySpeciality=doctors.stream()
			.sorted((o1,o2)->o1.getDoctorName().compareTo(o2.getDoctorName()))
			.collect(Collectors.toList());
			if(doctorsBySpeciality.isEmpty())
			{
				throw new DoctorNotFoundException("doctor not foundwith that speciality");
			}
		}catch(SQLException e)
			{
				e.printStackTrace();
			}finally
			{
				DbConnection.closeConnection();
			}
			
		return doctorsBySpeciality;
		
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctors=new ArrayList<>();
		List<Doctor> doctorsBySpecialityAndExp=new ArrayList<>();
		Connection connection;
		try {
			connection=DbConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement("select * from doctor where speciality=? and experience=?");
			statement.setString(1, speciality);
			statement.setInt(2,experience);
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				String doctorname=rs.getString("doctorName");
				int doctorid=rs.getInt("doctorId");
				String speciality1=rs.getString("speciality");
				int experience1=rs.getInt("experience");
				double fees=rs.getDouble("fees");
				LocalDateTime startdate= rs.getTimestamp("startDate").toLocalDateTime();
				LocalDateTime endtime=rs.getTimestamp("endTime").toLocalDateTime();

				Doctor doctor=new Doctor(doctorname,doctorid,speciality1,fees,experience1,startdate,endtime);
				 doctors.add(doctor);
			}
			doctorsBySpecialityAndExp=doctors.stream()
					.sorted((o1,o2)->o1.getDoctorName().compareTo(o2.getDoctorName()))
					.collect(Collectors.toList());
			if(doctorsBySpecialityAndExp.isEmpty())
			{
				throw new DoctorNotFoundException("doctor not foundwith that speciality");
			}
		}catch(SQLException e)
			{
				e.printStackTrace();
			}finally
			{
				DbConnection.closeConnection();
			}
			
		return doctorsBySpecialityAndExp;
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctors=new ArrayList<>();
		List<Doctor> doctorsBySpecialityAndFees=new ArrayList<>();
		Connection connection;
		try {
			connection=DbConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement("select * from doctor where speciality=? and fees=?");
			statement.setString(1, speciality);
			statement.setDouble(2, fees);
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				String doctorname=rs.getString("doctorName");
				int doctorid=rs.getInt("doctorId");
				String speciality1=rs.getString("speciality");
				int experience=rs.getInt("experience");
				double fees1=rs.getDouble("fees");
				LocalDateTime startdate= rs.getTimestamp("startDate").toLocalDateTime();
				LocalDateTime endtime=rs.getTimestamp("endTime").toLocalDateTime();

				Doctor doctor=new Doctor(doctorname,doctorid,speciality1,fees1,experience,startdate,endtime);
				 doctors.add(doctor);
			}
			doctorsBySpecialityAndFees=doctors.stream()
					.sorted((o1,o2)->o1.getDoctorName().compareTo(o2.getDoctorName()))
					.collect(Collectors.toList());
			if(doctorsBySpecialityAndFees.isEmpty())
			{
				throw new DoctorNotFoundException("doctor not foundwith that speciality");
			}
		}catch(SQLException e)
			{
				e.printStackTrace();
			}finally
			{
				DbConnection.closeConnection();
			}
			
		return doctorsBySpecialityAndFees;
	}

	@Override
	public List<Doctor> findByAvailability(LocalDateTime startTime) {
		// TODO Auto-generated method stub
		return null;
	}

}
