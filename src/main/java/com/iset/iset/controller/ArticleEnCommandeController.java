package com.iset.iset.controller;

import com.iset.iset.model.ArticleEnCommande;
import com.iset.iset.model.Commande;
import com.iset.iset.service.ArticleEnCommandeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleEnCommandeController {
    private final ArticleEnCommandeService service;

    public ArticleEnCommandeController(ArticleEnCommandeService service) {
        this.service = service;
    }
    @PostMapping("/addarticleencommande")
    public ResponseEntity<ArticleEnCommande> Ajoutcommande(@RequestBody ArticleEnCommande arten){

        ArticleEnCommande artes=service.addArticleEncommande(arten);
        return new ResponseEntity<>(artes, HttpStatus.CREATED);

    }
}
