package com.iset.iset.service;

import com.iset.iset.Repository.commandeRepo;
import com.iset.iset.model.CuisineStuff;
import com.iset.iset.model.Commande;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class commandeService {
    private final commandeRepo repo;

    public commandeService(commandeRepo repo) {
        this.repo = repo;
    }


    public Commande addCommande(Commande cmd){
        return this.repo.save(cmd);
    }
    public void deleteCommande(Long id){
        this.repo.deleteById(id);
    }
    public List<Commande> getAllCommande(){
        return this.repo.findAll();
    }


    public List<Commande> toutLesCommandeDeCuisineStuffById(Long id) {
        return repo.toutLesCommandeDeCuisineStuffById(id);
    }
}
