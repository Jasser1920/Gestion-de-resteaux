package com.iset.iset.controller;

import com.iset.iset.model.Article;
import com.iset.iset.service.articleSevice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class articleControlller {
    private final articleSevice service;

    public articleControlller(articleSevice service) {
        this.service = service;
    }
    @GetMapping("/getallarticle")
    public ResponseEntity<List<Article>> getallarticle (){
        List artcs =service.afficheArticle();
        return new ResponseEntity<>(artcs, HttpStatus.OK);
    }

    @PostMapping("/addarticle")
    public ResponseEntity<Article> ajoutArticle(@RequestBody Article art){
        Article artc=service.addArticle(art);
        return new ResponseEntity<>(artc, HttpStatus.CREATED);
    }
    @PostMapping(value = "/deletearticle/{id}")
    public ResponseEntity<Article> deletearticle(@PathVariable("id") Long id){
        service.deleteArticle(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/getarticledemenu/{id}")
    public ResponseEntity<List<Article>> getarticleformenubyID(@PathVariable("id") Long id){
        List artc=service.getarticleformenubyID(id);
        return new ResponseEntity<>(artc,HttpStatus.OK);
    }
}
