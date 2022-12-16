package com.iset.iset.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_article")
    private long id;
    @Column(name="nom")
private String nom;
    @Column(name="prix")
private float prix;
    @Column(name="description")
private String description ;
    @Column(name="type")
private String type ;
    @Column(name = "Quantity")
    private int Quantity;

public Article(){
    super();
}


    public Article(long id, String nom, float prix, String description, String type) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.type = type;
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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "articles_for_menu")
    private Menu articles_for_menu;

    public Article(Menu menu) {
        this.articles_for_menu = menu;
    }

    public Menu getMenu() {
        return articles_for_menu;
    }

    public void setMenu(Menu menu) {
        this.articles_for_menu = menu;
    }

    @OneToMany(mappedBy = "Article",cascade=CascadeType.ALL)
    private List<ArticleEnCommande> Articecommandes;

}
