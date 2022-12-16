package com.iset.iset.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Menu")
    private Long id;


    public Menu(){
        super();
    }

    public Menu(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "articles_for_menu")
    private List<Article> articlesList_for_menus;



    @OneToMany(mappedBy = "Menu")
    private List<RestaurentStuff> Restaurent_stuff;
}
