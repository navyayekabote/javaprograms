package com.doctorapp.util;

public class Queries {
	public static final String CREATEQUERY=
			"create table doctor(doctorName varchar(20),doctorId number primary key,speciality varchar(30),"
			+"experience number,fees rea,startDate timeStamp,endTime timeStamp)";
	public static final String INSERTQUERY=
			"insert into doctor(doctorName,doctorId,speciality,experience,fees,startDate,endTime) values(?,?,?,?,?,?,?)";
	public static final String UPDATEQUERY=
			"update doctor set fees=? where doctorID=?";
	public static final String DELETEQUERY=
			"delete from doctor where doctorId=?";
	public static final String QUERYBYID="";
	public static final String QUERYBYSPECIALITY="";
	public static final String QUERYSPECIALITYEXP="";
}
