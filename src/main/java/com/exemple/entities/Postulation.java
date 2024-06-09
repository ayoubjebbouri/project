package com.exemple.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Postulation {
	    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    Long ID;
	    int IDOffer;
	    int IDC;
	    Date Datepostuler;
		
		public Postulation(Long iD, int iDOffer, int iDC, Date datepostuler) {
			super();
			ID = iD;
			IDOffer = iDOffer;
			IDC = iDC;
			Datepostuler = datepostuler;
		}

		public Long getID() {
			return ID;
		}

		public void setID(Long iD) {
			ID = iD;
		}

		public int getIDOffer() {
			return IDOffer;
		}

		public void setIDOffer(int iDOffer) {
			IDOffer = iDOffer;
		}

		public int getIDC() {
			return IDC;
		}

		public void setIDC(int iDC) {
			IDC = iDC;
		}

		public Date getDatepostuler() {
			return Datepostuler;
		}

		public void setDatepostuler(Date datepostuler) {
			Datepostuler = datepostuler;
		}

		public Postulation() {
			super();
			
		}
}
