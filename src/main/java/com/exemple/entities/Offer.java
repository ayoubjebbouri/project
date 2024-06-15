package com.exemple.entities;



import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
@Entity
@Table(name = "Offer")
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


    public Offer(Long IDOffer, String Title, String GradeOffer, Date DatePos, Date DateFin, int NumberPost,
                 int NUM, String TypeDiploma, String LabelDiploma, String City, String Country,
                 int IDSociete) {
        super();
        this.IDOffer = IDOffer;
        this.Title = Title;
        this.GradeOffer = GradeOffer;
        this.DatePos = DatePos;
        this.DateFin = DateFin;
        this.NumberPost = NumberPost;
        this.NUM = NUM;
        this.TypeDiploma = TypeDiploma;
        this.LabelDiploma = LabelDiploma;
        this.City = City;
        this.Country = Country;
        this.IDSociete = IDSociete;
    }
    public Offer() {
        super();
    }


    public Long getIDOffer() {
        return IDOffer;
    }


    public void setIDOffer(Long IDOffer) {
        this.IDOffer = IDOffer;
    }


    public String getTitle() {
        return this.Title;
    }


    public void setTitle(String Title) {
        this.Title = Title;
    }


    public String getGradeOffer() {
        return GradeOffer;
    }


    public void setGradeOffer(String GradeOffer) {
        this.GradeOffer = GradeOffer;
    }


    public Date getDatePos() {
        return DatePos;
    }


    public void setDatePos(Date DatePos) {
        this.DatePos = DatePos;
    }


    public Date getDateFin() {
        return DateFin;
    }


    public void setDateFin(Date DateFin) {
        this.DateFin = DateFin;
    }


    public int getNumberPost() {
        return NumberPost;
    }


    public void setNumberPost(int NumberPost) {
        this.NumberPost = NumberPost;
    }




    public int getNUM() {
        return NUM;
    }


    public void setNUM(int NUM){
        this.NUM = NUM;
    }


    public String getTypeDiploma() {
        return TypeDiploma;
    }


    public void setTypeDiploma(String TypeDiploma) {
        this.TypeDiploma = TypeDiploma;
    }


    public String getLabelDiploma() {
        return LabelDiploma;
    }


    public void setLabelDiploma(String LabelDiploma) {
        this.LabelDiploma = LabelDiploma;
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


    public int getIDSociete() {
        return IDSociete;
    }


    public void setIDSociete(int IDSociete) {
        this.IDSociete = IDSociete;
    }
}
