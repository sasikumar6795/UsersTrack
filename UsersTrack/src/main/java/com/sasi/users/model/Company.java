package com.sasi.users.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Embeddable
@AllArgsConstructor
public class Company {
	
	 @Column( name = "company_name")
	    private String name;
	    private String catchPhrase;
	    private String bs;

	    public Company() {}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCatchPhrase() {
			return catchPhrase;
		}

		public void setCatchPhrase(String catchPhrase) {
			this.catchPhrase = catchPhrase;
		}

		public String getBs() {
			return bs;
		}

		public void setBs(String bs) {
			this.bs = bs;
		}

}
