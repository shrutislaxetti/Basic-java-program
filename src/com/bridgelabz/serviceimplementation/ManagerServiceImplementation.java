package com.bridgelabz.serviceimplementation;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.utility.Utility;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

public class ManagerServiceImplementation implements ManagerService {

	File file = new File("/home/bridgrlabz/shruthi/ClinicManagement/src/com/bridgelabz/files/Doctor.json");
	File file1 = new File("/home/bridgrlabz/shruthi/ClinicManagement/src/com/bridgelabz/files/Patient.json");
	File file2 = new File("/home/bridgrlabz/shruthi/ClinicManagement/src/com/bridgelabz/files/Appointments.json");

	static ObjectMapper mapper = new ObjectMapper();
	List<Patient> list1 = new ArrayList<>();
	List<Doctor> list = new ArrayList<>();
	
	/**
	 * function to Add doctor to the doctor file
	 */
	public void addDoctor() throws Exception {
		list = Utility.parseJSONArray(file, Doctor.class);
		list = Utility.adddoctor(list);
		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			mapper.writeValue(file, list);
			System.out.println("Writing successful..");
		}
	}
	
	/**
	 * function to Update doctor from the doctor file
	 */
	public void updateDoctor() throws Exception {
		
		list = Utility.parseJSONArray(file, Doctor.class);
		if(!list.isEmpty()) {
		System.out.println("enter the index where it need to be updated..");
		int index = Utility.userInputInteger();
		
		list = Utility.updatedoctor(list, index);
		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			//list.remove(index);
			mapper.writeValue(file, list);
			System.out.println("Writing successful..");
		}
		}
		else {
			System.out.println("No data to update..");
		}
	}

	@Override
	
	/**
	 * function to delete doctor from the doctor file
	 */
	public void deleteDoctor() throws Exception {

		list = Utility.parseJSONArray(file, Doctor.class);
		if (!list.isEmpty()) {
			System.out.println("Enter the doctor id to be deleted");
			String id = Utility.userInputString();

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getDoctorid().equals(id))
					list.remove(i);
			}
			
			System.out.println("Do you want to Save ...Press Y/N");
			String choice = Utility.userInputString();
			if ("Y".equalsIgnoreCase(choice)) {
				mapper.writeValue(file, list);
			}

		} else {
			System.out.println("list is empty...");
		}
	}
	/**
	 * function to add Patient to the patient file
	 */
	public void addPatient() throws Exception {
		list1 = Utility.parseJSONArray(file1, Patient.class);
		list1 = Utility.addPatient(list1);
		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			mapper.writeValue(file1, list1);
		}
	}
	/**
	 * function to delete Patient to the patient file
	 */
	public void deletePatient() throws Exception {
	
		list1 = Utility.parseJSONArray(file1, Patient.class);
		if (!list1.isEmpty()) {
			System.out.println("Enter the Patient Id to be deleted");
			String id = Utility.userInputString();

			for (int i = 0; i < list1.size(); i++) {

				if (list1.get(i).getPatientid().equals(id))
					list1.remove(i);
			}
			mapper.writeValue(file1, list1);
			System.out.println("Do you want to Save ...Press Y/N");
			String choice = Utility.userInputString();
			if ("Y".equalsIgnoreCase(choice)) {
				mapper.writeValue(file1, list1);
			}

		} else {
			System.out.println("list is empty...");
		}
	}

	/**
	 * function to Update Patient to the patient file
	 */
	public void updatePatient() throws Exception {
		
		System.out.println("enter the index where it need to be updated..");
		int index = Utility.userInputInteger();
		list1 = Utility.parseJSONArray(file1,Patient.class);
		
		list1 = Utility.updatePatient(list1,index);
		
		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			//list1.remove(index);
			mapper.writeValue(file1, list1);
			System.out.println("Writing successful..");
		}	
	}

}

