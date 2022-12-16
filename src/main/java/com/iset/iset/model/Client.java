package com.iset.iset.model;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_client")
    private long id;

    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "Telephone")
    private Integer tel;
    @Column(name = "Email_adresse")
    private String email;
    @Column(name = "Table_number")
    private float table_id;

    @OneToOne(mappedBy = "client")
    private Commande commande;

    @OneToOne(mappedBy = "client")
    private Reservation reservation;

    public Client(long id, String nom, String prenom, Integer tel, String email, float table_id) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
        this.table_id = table_id;
    }
    public Client(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getTable_id() {
        return table_id;
    }

    public void setTable_id(float table_id) {
        this.table_id = table_id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel=" + tel +
                ", email='" + email + '\'' +
                ", table_id=" + table_id +
                '}';
    }
}
