package com.iset.iset.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reservation")
    private Long id;

    @Column(name = "date")
    private String date;
    @Column(name = "nombre_personnes")
    private float nbr_personne;





    public Reservation(Long id, String date, float nbr_personne, Client client) {
        this.id = id;
        this.nbr_personne = nbr_personne;
        this.date = date;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getNbr_personne() {
        return nbr_personne;
    }

    public void setNbr_personne(float nbr_personne) {
        this.nbr_personne = nbr_personne;
    }

    @OneToMany(mappedBy = "Reservation")
    private List<RestaurentStuff> RestaurentStuffReservation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client")
    private Client client;

    public Reservation(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    @OneToOne(mappedBy = "reservation")
    private Commande commande;



    public Reservation(){
        super();
    }
}
