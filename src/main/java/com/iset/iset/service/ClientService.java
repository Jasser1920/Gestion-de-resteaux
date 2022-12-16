package com.iset.iset.service;

import com.iset.iset.Repository.ClientRepository;
import com.iset.iset.Repository.articleRepository;
import com.iset.iset.model.Article;
import com.iset.iset.model.Client;
import com.iset.iset.model.CuisineStuff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository repo;

    public ClientService(ClientRepository repo) {
        this.repo = repo;
    }

    public Client addClient(Client art){
        return this.repo.save(art);
    }
    public void deleteClient(Long id){
        this.repo.deleteById(id);
    }
    public List<Client> afficheClient(){
        return this.repo.findAll();
    }
    public Client UpdateClient(Client CST){
        return this.repo.save(CST);
    }
}
