package com.bridgelabz.service;

import com.bridgelabz.model.Doctor;

public interface DoctorService {
	
	public void viewDoctorDetails() throws Exception;

	public Doctor searchDoctorbyName() throws Exception;

	public Doctor searchDoctorbyId() throws Exception;

	public  Doctor searchDoctorbySpecialization() throws Exception;

	public Doctor searchDoctorbyAvailibility() throws Exception;

}
