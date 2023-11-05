package com.rabbit.locateapp.model;

import lombok.Data;

@Data
public class Location {

	private String locName;
	private String offName;
	private int pincode;
	private String subDistName;
	private String distName;
	private State state;
}
