package br.com.Agenda;

import java.util.Arrays;

public class Schedule {

	private Contact [] contact;
	
	public Schedule() {
		 contact = new Contact[5];
	}

	// método adiciona contato
	public void addContact(Contact userContact) throws ScheduleException {
		
		boolean scheduleFull = true;
		
		for(int i =0;i<contact.length;i++) {
			if(contact != null) {
				contact[i] = userContact;
				scheduleFull = false;
				break;
			}
		}
		
		if(scheduleFull) {
			throw new ScheduleException();	
		}
	}
	
	// método consulta nome de contato
	public int consulName(String name) throws ContactException {
		for(int i = 0; i< contact.length;i++) {
			if(contact[i]!= null) {
				if(contact[i].getName().equalsIgnoreCase(name));{
					return i;
				}	
			}
		}
		throw new ContactException(name);
	
	}
	
	@Override
	public String toString() {
		String user ="";
		for(Contact userContact:contact) {
			if(userContact != null) {	
				user += userContact.toString() + "\n";
			}
		}
		
		return user;
	}
	
	

}
