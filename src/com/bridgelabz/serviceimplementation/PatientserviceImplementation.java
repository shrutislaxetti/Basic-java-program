package com.bridgelabz.serviceimplementation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.DoctorService;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.service.PatientService;
import com.bridgelabz.utility.Utility;

public class PatientserviceImplementation implements PatientService {
	List<Patient> patientlist = new ArrayList<>();
	List<Doctor> doctorlist = new ArrayList<>();
	List<Appointment> appointmentlist = new ArrayList<>();
	ObjectMapper mapper = new ObjectMapper();

	File file = new File("/home/bridgrlabz/shruthi/ClinicManagement/src/com/bridgelabz/files/Doctor.json");
	File file2 = new File("/home/bridgrlabz/shruthi/ClinicManagement/src/com/bridgelabz/files/Appointment.json");
	File file1 = new File("/home/bridgrlabz/shruthi/ClinicManagement/src/com/bridgelabz/files/Patient.json");
	ManagerService manager = new ManagerServiceImplementation();
	DoctorService doctor = new DoctorserviceImplementaion();
	Doctor d = new Doctor();
	Patient p = new Patient();

	Appointment appoint = new Appointment();
	 
	/*
	 * function to add appointments to the apppointment file whenever the doctor is
	 * availble
	 */
	public void takeAppointments() throws Exception {
		System.out.println("enter the docor name");
		String doctorname = Utility.userInputString();
		int count;
		int index = 0;
		doctorlist = Utility.parseJSONArray(file, Doctor.class);

		for (int i = 0; i < doctorlist.size(); i++) {
			if (doctorlist.get(i).getDoctorname().equalsIgnoreCase(doctorname)) {
				index = i;
				break;
			}
		}

		count = doctorlist.get(index).getCount();
		
		if (count <5) {
			manager.addPatient();
			addAppointement(index);
			count = count + 1;
			doctorlist.get(index).setCount(count);
			Utility.mapper.writeValue(file, doctorlist);
		} 
		else if(count==5) {
			
				System.out.println("take appointment next day");
			}
		
		else {
			System.out.println("Search for someother doctor");
		}
	}

	/*
	 * function to add appointments to the apppointment file whenever the doctor is
	 * availble
	 * 
	 * @ param : takes the index where the doctor is found..
	 */
	public void addAppointement(int index) throws Exception {

		appointmentlist = Utility.parseJSONArray(file2, Appointment.class);

		for (int i = 0; i < doctorlist.size(); i++) {
			if (i == index) {
				appoint.setDoctorName(doctorlist.get(index).getDoctorname());
				appoint.setDoctorId(doctorlist.get(index).getDoctorid());
			}
		}

		System.out.println("Enter patient Name");
		Utility.userInputNextLine();
		String patientName = Utility.userInputString();
		appoint.setPatientName(patientName);
		System.out.println("Enter Patient Id");
		String patientId = Utility.userInputString();
		appoint.setPatientId(patientId);
		appoint.setTimestamp(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
		appointmentlist.add(appoint);

		mapper.writeValue(file2, appointmentlist);
		System.out.println("writing successfull...");
	}

	/*
	 * function to view the Patient details in from the patient file
	 * @ param : void
	 */
	
	public void viewPatientDetails1() throws Exception {
		patientlist = Utility.parseJSONArray(file1, Patient.class);
		for (int i = 0; i < patientlist.size(); i++) {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(patientlist.get(i)));
		}
	}

	/*
	 * function to show the popular doctor based on the count value in from the doctor file
	 * @ param : void
	 */
	public void showPopularDoctor() throws Exception {
		List<Doctor> list = new ArrayList<>();
		doctorlist = Utility.parseJSONArray(file, Doctor.class);
		int count = doctorlist.get(0).getCount();
		for (int i = 0; i < doctorlist.size(); i++) {
			if (count < doctorlist.get(i).getCount()) {
				count = doctorlist.get(i).getCount();
			}
		}
		for (int i = 0; i < doctorlist.size(); i++) {
			if (doctorlist.get(i).getCount() == count) {
				list.add(doctorlist.get(i));
				System.out.println(mapper.writeValueAsString(list));
				break;
			}
		}
	}
	
	/*
	 * function to show the popular Specialization based on the count value in from the doctor file
	 * @ param : void
	 */
	public void showPopularSpecialization() throws Exception {
		List<Doctor> list = new ArrayList<>();
		doctorlist = Utility.parseJSONArray(file, Doctor.class);
		int count = doctorlist.get(0).getCount();
		for (int i = 0; i < doctorlist.size(); i++) {
			if (count < doctorlist.get(i).getCount()) {
				count = doctorlist.get(i).getCount();
			}
		}
		for (int i = 0; i < doctorlist.size(); i++) {
			if (doctorlist.get(i).getCount() == count) {
				list.add(doctorlist.get(i));
				System.out.println(mapper.writeValueAsString(list));
				break;
			}
		}
	}
	
	/*
	 * function to search patient by patient name 
	 * @ param : void
	 */
	public Patient searchPatientbyName() throws Exception {
		patientlist = Utility.parseJSONArray(file1, Patient.class);
		if (!patientlist.isEmpty()) {
			System.out.println("Enter the Patient Name to be searched...");
			String patientName = Utility.userInputString();
			for (int i = 0; i < patientlist.size(); i++) {
				if (patientlist.get(i).getPatientname().equalsIgnoreCase(patientName))
					System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(patientlist.get(i)));
				return patientlist.get(i);
			}
		}
		return null;

	}
	/*
	 * function to search patient by patient Id
	 * @ param : void
	 */
	public void searchPatientbyId() throws Exception {
		patientlist = Utility.parseJSONArray(file1, Patient.class);
		if (!patientlist.isEmpty()) {
			System.out.println("Enter the Patient ID to be searched...");
			String patientid = Utility.userInputString();
			for (int i = 0; i < patientlist.size(); i++) {

				if (patientlist.get(i).getPatientid().equalsIgnoreCase(patientid))
					System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(patientlist.get(i)));
			}
		}
	}
	
	/*
	 * function to search patient by patient Mobilenumber
	 * @ param : void
	 */
	public void searchPatientbyMobilenum() throws Exception {
		patientlist = Utility.parseJSONArray(file1, Patient.class);
		if (!patientlist.isEmpty()) {
			System.out.println("Enter the doctor Name to be searched...");
			String patientmobilenum = Utility.userInputString();
			for (int i = 0; i < patientlist.size(); i++) {
				if (patientlist.get(i).getPatientname().equalsIgnoreCase(patientmobilenum))
					System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(patientlist.get(i)));
			}
		}
	}

	/*
	 * function to search patient by patient Age 
	 * @ param : void
	 */
	public void searchPatientbyAge() throws Exception {
		patientlist = Utility.parseJSONArray(file1, Patient.class);
		if (!patientlist.isEmpty()) {
			System.out.println("Enter the doctor Name to be searched...");
			int patientage = Utility.userInputInteger();
			for (int i = 0; i < patientlist.size(); i++) {
				if (patientlist.get(i).getAge() == patientage)
					System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(patientlist.get(i)));
			}
		}
	}

}
