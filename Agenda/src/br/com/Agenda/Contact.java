package br.com.Agenda;

public class Contact {
	
	private static int counter = 0;
	
	private int id;
	private String name;
	private String phone;
	private String email;
	
	// Construtor adiciona id a cada contato adicionado
	public Contact() {
		counter++;
		id = counter;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String toString() {
		
		StringBuilder message = new StringBuilder();
		message.append("ID: "+id +"\n");
		message.append("User: "+name+"\n");
		message.append("Phone: "+phone+"\n");
		message.append("E-Mail: "+email+"\n");
		
		return message.toString();
	}

}
