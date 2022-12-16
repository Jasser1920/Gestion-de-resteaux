package com.iset.iset.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class CuisineStuff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_CuisineStuff")
    private long id;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="email")
    private String email;
    @Column(name="pass")
    private String Pass;
    @Column(name="telephone")
    private String telephone;
    @Column(name="adresse")
    private String adresse;


    @OneToMany(mappedBy = "CuisineStuff")
    private List<Commande> commands;

    public CuisineStuff() {
super();
    }
    public CuisineStuff(long user_Cuisine_id, String nom, String prenom, String email, String pass, String telephone, String adresse) {
        id = user_Cuisine_id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        Pass = pass;
        this.telephone = telephone;
        this.adresse = adresse;
    }



    public long getUser_Cuisine_id() {
        return id;
    }

    public void setUser_Cuisine_id(long user_Cuisine_id) {
        id = user_Cuisine_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }





    @Override
    public String toString() {
        return "CuisineStuff{" +
                "User_Cuisine_id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", Pass='" + Pass + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
