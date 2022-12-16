package com.iset.iset.service;

import com.iset.iset.Repository.articleRepository;
import com.iset.iset.model.Article;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class articleSevice {
    private articleRepository repo;
    public articleSevice(articleRepository repo) {
        this.repo = repo;
    }


    public Article addArticle(Article art){
        return this.repo.save(art);
    }
    public void deleteArticle(Long id){
        this.repo.deleteById(id);
    }
    public List<Article> afficheArticle(){
        return this.repo.findAll();
    }
    public List<Article> getarticleformenubyID(Long id){
        return this.repo.getarticleformenubyID(id);
    }
}
