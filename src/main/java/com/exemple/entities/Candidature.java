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
	    @NotEmpty @Size(min = 8, max = 15)
	    String Password;
	    @NotEmpty
	    String niveau;
	    String City;
	    String Country;
		public Long getIDC() {
			return IDC;
		}
		public void setIDC(Long iDC) {
			IDC = iDC;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
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
		public void setDateN(LocalDate dateN) {
			DateN = dateN;
		}
		public String getNumCNI() {
			return NumCNI;
		}
		public void setNumCNI(String numCNI) {
			NumCNI = numCNI;
		}
		public String getNUM() {
			return NUM;
		}
		public void setNUM(String nUM) {
			NUM = nUM;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
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
		public void setCity(String city) {
			City = city;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
		public Candidature(Long iDC, @NotEmpty String lastName, @NotEmpty String firstName, @NotEmpty String sexe,
				@NotEmpty LocalDate dateN, @NotEmpty @Size(min = 8, max = 12) String numCNI, @NotEmpty String nUM,
				@NotEmpty String email, @NotEmpty @Size(min = 8, max = 15) String password, @NotEmpty String niveau,
				 String city, String country) {
			super();
			IDC = iDC;
			LastName = lastName;
			FirstName = firstName;
			this.sexe = sexe;
			DateN = dateN;
			NumCNI = numCNI;
			NUM = nUM;
			Email = email;
			Password = password;
			this.niveau = niveau;
			City = city;
			Country = country;
		}
		public Candidature() {
			super();
			
		}

	    
}
