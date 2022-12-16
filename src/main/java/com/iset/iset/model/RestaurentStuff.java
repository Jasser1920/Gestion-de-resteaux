package com.iset.iset.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class RestaurentStuff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_RestaurentStuff")
    private Long id;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="username")
    private String username;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="telephone")
    private Integer telephone;
    @Column(name="adresse")
    private String adresse;




    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_Menu")
    private Menu Menu;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_reservation")
    private Reservation Reservation;


    public RestaurentStuff(){
    super();
    }

    public RestaurentStuff(Long id, String nom, String prenom, String username, String email, String password, Integer telephone, String adresse, Menu id_menu, Reservation reservation_client) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.adresse = adresse;
        this.Menu = id_menu;
        this.Reservation = reservation_client;
    }

    public com.iset.iset.model.Menu getMenu() {
        return Menu;
    }

    public void setMenu(com.iset.iset.model.Menu menu) {
        Menu = menu;
    }

    public com.iset.iset.model.Reservation getReservation() {
        return Reservation;
    }

    public void setReservation(com.iset.iset.model.Reservation reservation) {
        Reservation = reservation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
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
        return "RestaurentStuff{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", telephone=" + telephone +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
