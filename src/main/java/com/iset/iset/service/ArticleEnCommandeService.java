package com.iset.iset.service;

import com.iset.iset.Repository.ArticleEnCommnadeRepository;
import com.iset.iset.model.ArticleEnCommande;
import org.springframework.stereotype.Service;

@Service
public class ArticleEnCommandeService {
    private ArticleEnCommnadeRepository repo;

    public ArticleEnCommandeService(ArticleEnCommnadeRepository repo) {
        this.repo = repo;
    }
    public ArticleEnCommande addArticleEncommande(ArticleEnCommande arten){
      return  this.repo.save(arten);
    }
}
