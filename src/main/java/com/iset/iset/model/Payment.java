package com.iset.iset.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_payment")
    private Long id;
    @Column(name="prix")
    private float prix;
    @Column(name="datepayment")
    private LocalDate date_payment;



    @OneToOne(mappedBy = "payment")
    private Commande commande;



    public Payment(Long id_paymnet, float prix, LocalDate date_payment) {
        this.id = id_paymnet;
        this.prix = prix;
        this.date_payment = date_payment;
    }

    public Payment() {
super();
    }

    public Long getId_paymnet() {
        return id;
    }

    public void setId_paymnet(Long id_paymnet) {
        this.id = id_paymnet;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public LocalDate getDate_payment() {
        return date_payment;
    }

    public void setDate_payment(LocalDate date_payment) {
        this.date_payment = date_payment;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id_paymnet=" + id +
                ", prix=" + prix +
                ", date_payment=" + date_payment +
                '}';
    }
}
