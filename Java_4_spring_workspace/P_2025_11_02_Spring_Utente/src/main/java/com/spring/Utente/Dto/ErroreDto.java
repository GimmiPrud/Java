package com.spring.Utente.Dto;

public class ErroreDto {
	
	private String message;
	
	
	public ErroreDto(String message) {
		super();
		this.message = message;
	}
	

	public ErroreDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
