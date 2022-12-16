package com.iset.iset.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ArticleEnCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "prix_totale")
    private float prix_totale;
    @JsonIgnore
    @ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name = "id_articleencommande")
    private Article Article;

    public ArticleEnCommande() {
        super();
    }

    public ArticleEnCommande(Long id, float prix_totale, com.iset.iset.model.Article article) {
        this.id = id;
        this.prix_totale = prix_totale;
        this.Article = article;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getPrix_totale() {
        return prix_totale;
    }

    public void setPrix_totale(float prix_totale) {
        this.prix_totale = prix_totale;
    }

    public com.iset.iset.model.Article getArticle() {
        return Article;
    }

    public void setArticle(com.iset.iset.model.Article article) {
        Article = article;
    }

    @OneToOne(mappedBy = "articlescettecommande")
    private Commande commandes;



}