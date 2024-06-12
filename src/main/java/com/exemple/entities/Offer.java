package com.exemple.entities;



import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
@Entity
public class Offer {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long IDOffer;
	@NotEmpty 
    String Title;
	@NotEmpty 
    String GradeOffer;
	@NotEmpty 
    Date DatePos;
	@NotEmpty 
    Date DateFin;
    int NumberPost;
    @NotEmpty 
    int NUM;
    @NotEmpty 
    String TypeDiploma;
    @NotEmpty 
    String LabelDiploma;
    @NotEmpty 
    String City;
    @NotEmpty 
    String Country;
    @NotEmpty 
    int IDSociete;


    public Offer(Long iDOffer, String title, String gradeOffer, Date datePos, Date dateFin, int numberPost,
                 int nUM, String typeDiploma, String labelDiploma, String city, String country,
                 int iDSociete) {
        super();
        IDOffer = iDOffer;
        this.Title = title;
        GradeOffer = gradeOffer;
        DatePos = datePos;
        DateFin = dateFin;
        NumberPost = numberPost;
        NUM = nUM;
        TypeDiploma = typeDiploma;
        LabelDiploma = labelDiploma;
        City = city;
        Country = country;
        IDSociete = iDSociete;
    }
    public Offer() {
        super();
    }


    public Long getIDOffer() {
        return IDOffer;
    }


    public void setIDOffer(Long iDOffer) {
        IDOffer = iDOffer;
    }


    public String getTitle() {
        return this.Title;
    }


    public void setTitle(String title) {
        this.Title = title;
    }


    public String getGradeOffer() {
        return GradeOffer;
    }


    public void setGradeOffer(String gradeOffer) {
        GradeOffer = gradeOffer;
    }


    public Date getDatePos() {
        return DatePos;
    }


    public void setDatePos(Date datePos) {
        DatePos = datePos;
    }


    public Date getDateFin() {
        return DateFin;
    }


    public void setDateFin(Date dateFin) {
        DateFin = dateFin;
    }


    public int getNumberPost() {
        return NumberPost;
    }


    public void setNumberPost(int numberPost) {
        NumberPost = numberPost;
    }




    public int getNUM() {
        return NUM;
    }


    public void setNUM(int nUM) {
        NUM = nUM;
    }


    public String getTypeDiploma() {
        return TypeDiploma;
    }


    public void setTypeDiploma(String typeDiploma) {
        TypeDiploma = typeDiploma;
    }


    public String getLabelDiploma() {
        return LabelDiploma;
    }


    public void setLabelDiploma(String labelDiploma) {
        LabelDiploma = labelDiploma;
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


    public int getIDSociete() {
        return IDSociete;
    }


    public void setIDSociete(int iDSociete) {
        IDSociete = iDSociete;
    }
}
