package com.exemple.entities;
import java.sql.Blob;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;


@Entity
public class Deplomcondidat {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotEmpty 
	private Long IDCondidat;
	@NotEmpty 
	private Long IDDeplom;
	@NotEmpty
	public Deplomcondidat( ) {
		super();
		
	}
	public Deplomcondidat(long id, @NotEmpty Long iDCondidat, @NotEmpty Long iDDeplom) {
		super();
		this.id = id;
		IDCondidat = iDCondidat;
		IDDeplom = iDDeplom;

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getIDCondidat() {
		return IDCondidat;
	}
	public void setIDCondidat(Long iDCondidat) {
		IDCondidat = iDCondidat;
	}
	public Long getIDDeplom() {
		return IDDeplom;
	}
	public void setIDDeplom(Long iDDeplom) {
		IDDeplom = iDDeplom;
	}

	

}
