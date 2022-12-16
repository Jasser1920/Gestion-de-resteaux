package com.iset.iset.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_commande")
    private long id;
    @Column(name="status")
    private String status;
    @Column(name="prix")
    private float prix;

    public Commande(float prix) {
        this.prix = prix;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Commande(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Article_de_cette_commande")
    private ArticleEnCommande articlescettecommande;

    public Commande(ArticleEnCommande articlescettecommande) {
        this.articlescettecommande = articlescettecommande;
    }

    public ArticleEnCommande getArticlescettecommande() {
        return articlescettecommande;
    }

    public void setArticlescettecommande(ArticleEnCommande articlescettecommande) {
        this.articlescettecommande = articlescettecommande;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_payment")
    private Payment payment;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client")
    private Client client;

    public Commande(Client client) {
        this.client = client;
    }

    public Commande(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="id_CuisineStuff")
    private CuisineStuff CuisineStuff;

    public Commande(com.iset.iset.model.CuisineStuff cuisineStuff) {
        CuisineStuff = cuisineStuff;
    }

    public com.iset.iset.model.CuisineStuff getCuisineStuff() {
        return CuisineStuff;
    }

    public void setCuisineStuff(com.iset.iset.model.CuisineStuff cuisineStuff) {
        CuisineStuff = cuisineStuff;
    }

    public void setUser_Cuisine_id(long user_Cuisine_id) {
        id = user_Cuisine_id;
    }




    public Commande() {
super();
    }

    public Commande(long id_commande ) {
        this.id = id_commande;

    }



    public long getId_commande() {
        return id;
    }

    public void setId_commande(long id_commande) {
        this.id = id_commande;
    }

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_reservation")
    private Reservation reservation;

    public Commande(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "commande{" +
                "id_commande=" + id +
                '}';
    }
}
