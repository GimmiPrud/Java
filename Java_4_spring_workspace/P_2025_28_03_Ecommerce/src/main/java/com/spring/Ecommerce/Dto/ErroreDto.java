package com.spring.Ecommerce.Dto;

public class ErroreDto {
	
	private String mex;
	

	public String getMex() {
		return mex;
	}

	public void setMex(String mex) {
		this.mex = mex;
	}

	public ErroreDto(String mex) {
		super();
		this.mex = mex;
	}
	
}
