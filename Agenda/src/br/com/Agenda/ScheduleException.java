package br.com.Agenda;

public class ScheduleException extends Exception {
	
	@Override
	public String getMessage() {
		return "Schedule  full";
	}
	
}
