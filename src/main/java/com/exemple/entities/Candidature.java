package com.exemple.entities;

import java.sql.Blob;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
@Entity
public class Candidature {
	   	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	   	Long IDC;
	   	@NotEmpty 
	    String LastName;
	   	@NotEmpty 
	    String FirstName;
	   	@NotEmpty 
	    String sexe;
		LocalDate DateN;
	   	@NotEmpty
	    String NumCNI;
	    @NotEmpty 
	    String NUM;
	    @NotEmpty 
	    String Email;
		private String PropertyName;
	    @NotEmpty @Size(min = 8, max = 15)
	    String Password;
	    @NotEmpty
	    String niveau;
	    String City;
	    String Country;
	    public void setPropertyName(String PropertyName) {
			this.PropertyName = PropertyName;
	}
 	    public String getPropertyName() {
		return this.PropertyName;
	}
		public Long getIDC() {
			return IDC;
		}
		public void setIDC(Long IDC) {
			this.IDC = IDC;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String LastName) {
			this.LastName = LastName;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String FirstName) {
			this.FirstName = FirstName;
		}
		public String getSexe() {
			return sexe;
		}
		public void setSexe(String sexe) {
			this.sexe = sexe;
		}
		public LocalDate getDateN() {
			return DateN;
		}
		public void setDateN(LocalDate DateN) {
			this.DateN = DateN;
		}
		public String getNumCNI() {
			return NumCNI;
		}
		public void setNumCNI(String NumCNI) {
			this.NumCNI = NumCNI;
		}
		public String getNUM() {
			return NUM;
		}
		public void setNUM(String NUM) {
			this.NUM = NUM;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String Email) {
			this.Email = Email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String Password) {
			this.Password = Password;
		}
		public String getNiveau() {
			return niveau;
		}
		public void setNiveau(String niveau) {
			this.niveau = niveau;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String City) {
			this.City = City;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String Country) {
			this.Country = Country;
		}
		public Candidature(Long IDC, @NotEmpty String LastName, @NotEmpty String FirstName, @NotEmpty String sexe,
				@NotEmpty LocalDate DateN, @NotEmpty @Size(min = 8, max = 12) String NumCNI, @NotEmpty String NUM,
				@NotEmpty String Email, @NotEmpty @Size(min = 8, max = 15) String Password, @NotEmpty String niveau,
				 String City, String Country,String PropertyName) {
			super();
			this.IDC = IDC;
			this.LastName = LastName;
			this.FirstName = FirstName;
			this.sexe = sexe;
			this.DateN = DateN;
			this.NumCNI = NumCNI;
			this.NUM = NUM;
			this.Email = Email;
			this.Password = Password;
			this.niveau = niveau;
			this.City = City;
			this.Country = Country;
			this.PropertyName = PropertyName;
		}
		public Candidature() {
			super();
			
		}

	    
}
