package br.com.Agenda;

import java.util.Scanner;

public class Main_Teste {

	public static void main(String[] args) {
		
		Schedule schedule = new Schedule();
		Scanner enter = new Scanner(System.in);
		int option = 1;
		
		while(option!=3) {
			option = optionMenu(enter);
			if(option ==1) {
				addContact(enter,schedule);
			}
			else if(option ==2){
				contactConsult(enter,schedule);
			}
			else if(option ==3) {
				System.out.println("System Exit!");
			}
		}
	}
	
	
	public static void addContact(Scanner enter, Schedule schedule){
		try {
			System.out.println("Create a new Contact. Enter with the information:");
			String name = informationReading(enter,"Enter with name of contact:");
			String phone = informationReading(enter,"Enter with phone of contact:");
			String email = informationReading(enter,"Enter with e-mail of contact:");
			System.out.println("");
		
			Contact contact = new Contact();
			contact.setName(name);
			contact.setPhone(phone);
			contact.setEmail(email);
			System.out.println("Contact to be created:");
			System.out.println(contact);
			
			schedule.addContact(contact);
			
		} catch (ScheduleException e) {
			System.out.println(e.getMessage());
			System.out.println("Contacts the schedule: \n");
			System.out.println(schedule);
		}
	}
	
	public static void contactConsult(Scanner enter,Schedule schedule) {
		String nameContact = informationReading(enter,"Type it name contact for consult1:");
		try {
			if(schedule.consulName(nameContact) >=0) {
				System.out.println("Contact Existing");
			}
		} catch (ContactException e) {
				System.out.println(e.getMessage());
		}
	}
	
	
	public static String informationReading(Scanner enter,String message) {
		
		System.out.println(message);
		String input = enter.nextLine();
		return input;
	}

	public static int optionMenu(Scanner enter) {
		boolean inputValid = false;
		int option = 3;
		while(!inputValid) {
		System.out.println("Digite uma opção: \n");
		System.out.println("Option 1:Add Contact \n");
		System.out.println("Option 2:  Consult Contact \n");
		System.out.println("Option 3: Exit");
		
			try {
					String input = enter.nextLine();
					option = Integer.parseInt(input);
					if(option == 1 || option == 2 || option == 3) {
						inputValid = true;
					}
					else {
						throw new Exception("Input Invalid!");
					}
				}
				catch(Exception e) {
				System.out.println("option invalidates.Type it again \n");
				}
		
		}
		
		return option;
	}
}
