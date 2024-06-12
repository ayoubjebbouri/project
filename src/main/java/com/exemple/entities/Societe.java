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
public class Societe {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		Long IDSociete;
		@NotEmpty 
	    String NomS;
		LocalDate DateCreation;
	    String FormeJuridique;
	    @NotEmpty
		String NUM;
	    @NotEmpty 
	    String Email;
	    @NotEmpty @Size(min = 8, max = 15)
	    String Password;
	    @NotEmpty
	    String Adresse;
	    String Description;
	    @NotEmpty 
	    String City;
	    @NotEmpty 
	    String Country;
	    public Societe(Long iDSociete, String nomS, LocalDate dateCreation, String formeJuridique, String nUM, String email,
	                   String password, String adresse, String description, String city, String country) {
	        super();
	        IDSociete = iDSociete;
	        this.NomS = nomS;
	        DateCreation = dateCreation;
	        FormeJuridique = formeJuridique;
	        NUM = nUM;
	        Email = email;
	        Password = password;
	        Adresse = adresse;
	        Description = description;
	        City = city;
	        Country = country;
	    }

	    public Societe() {
	        super();
	    }

	    public Long getIDSociete() {
	        return IDSociete;
	    }

	    public void setIDSociete(Long iDSociete) {
	        IDSociete = iDSociete;
	    }

	    public String getNomS() {
	        return NomS;
	    }

	    public void setNomS(String nomS) {
	        this.NomS = nomS;
	    }

	    public LocalDate getDateCreation() {
	        return DateCreation;
	    }

	    public void setDateCreation(LocalDate dateCreation) {
	        DateCreation = dateCreation;
	    }

	    public String getFormeJuridique() {
	        return FormeJuridique;
	    }

	    public void setFormeJuridique(String formeJuridique) {
	        FormeJuridique = formeJuridique;
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

	    public String getAdresse() {
	        return Adresse;
	    }

	    public void setAdresse(String adresse) {
	        Adresse = adresse;
	    }

	    public String getDescription() {
	        return Description;
	    }

	    public void setDescription(String description) {
	        Description = description;
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
}
