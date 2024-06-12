package com.exemple.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Deplom {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotEmpty 
	private String Name;
	@NotEmpty 
	private String Branche;
	private String niveau;
	@NotEmpty
	private String Grad;
	public Deplom() {
		super();
		
	}
	public Deplom(long id, String name, String branche, String niveau , String Grad) {
		super();
		this.id = id;
		Name = name;
		Branche = branche;
		niveau = niveau;
		Grad = Grad;
	}

	public String getGrad() {
		return Grad;
	}
	public void setGrad(String grad) {
		Grad = grad;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBranche() {
		return Branche;
	}
	public void setBranche(String branche) {
		Branche = branche;
	}
	public String getniveau() {
		return niveau;
	}
	public void setniveau(String niveau) {
		niveau = niveau;
	}
	
	
}
