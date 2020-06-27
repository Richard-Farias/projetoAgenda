package br.com.Agenda;

public class ContactException extends Exception{
	
	private String contactName;
	
	//construtor
	public ContactException(String contactName) {
		this.contactName = contactName;	
	}
	
	
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Contact '" + contactName  +"'  does not exist";
	}

}
