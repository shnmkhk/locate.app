package com.rabbit.locateapp.model;

public enum State {

	ANDAMAN_NICOBAR_ISLANDS(Country.INDIA, "ANDAMAN & NICOBAR ISLANDS"), ANDHRA_PRADESH(Country.INDIA, ""),
	ARUNACHAL_PRADESH(Country.INDIA, "ARUNACHAL PRADESH"), ASSAM(Country.INDIA, "ASSAM"), BIHAR(Country.INDIA, "BIHAR"),
	CHANDIGARH(Country.INDIA, "CHANDIGARH"), CHATTISGARH(Country.INDIA, "CHATTISGARH"),
	DADRA_NAGAR_HAVELI(Country.INDIA, "DADRA & NAGAR HAVELI"), DAMAN_DIU(Country.INDIA, "DAMAN & DIU"),
	DELHI(Country.INDIA, "DELHI"), GOA(Country.INDIA, "GOA"), GUJARAT(Country.INDIA, "GUJARAT"),
	HARYANA(Country.INDIA, "HARYANA"),
	HIMACHAL_PRADESH(Country.INDIA, "HIMACHAL PRADESH"), JAMMU_KASHMIR(Country.INDIA, "JAMMU & KASHMIR"),
	JHARKHAND(Country.INDIA, "JHARKHAND"), KARNATAKA(Country.INDIA, "KARNATAKA"), KERALA(Country.INDIA, "KERALA"),
	LAKSHADWEEP(Country.INDIA, "LAKSHADWEEP"), MADHYA_PRADESH(Country.INDIA, "MADHYA PRADESH"),
	MAHARASHTRA(Country.INDIA, "MAHARASHTRA"), MANIPUR(Country.INDIA, "MANIPUR"), MEGHALAYA(Country.INDIA, "MEGHALAYA"),
	MIZORAM(Country.INDIA, "MIZORAM"), NAGALAND(Country.INDIA, "NAGALAND"), ODISHA(Country.INDIA, "ODISHA"),
	PONDICHERRY(Country.INDIA, "PONDICHERRY"), PUNJAB(Country.INDIA, "PUNJAB"), RAJASTHAN(Country.INDIA, "RAJASTHAN"),
	SIKKIM(Country.INDIA, "SIKKIM"), TAMIL_NADU(Country.INDIA, "TAMIL NADU"), TELANGANA(Country.INDIA, "TELANGANA"),
	TRIPURA(Country.INDIA, "TRIPURA"), UTTAR_PRADESH(Country.INDIA, "UTTAR PRADESH"),
	UTTARAKHAND(Country.INDIA, "UTTARAKHAND"), WEST_BENGAL(Country.INDIA, "WEST BENGAL");

	private Country country;
	private String name;
	
	public Country getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	private State(final Country country, final String name) {
		this.country = country;
		this.name = name;
	};

}
