package com.iset.iset.service;

import com.iset.iset.Repository.RestaurentStuffRepository;
import com.iset.iset.model.Menu;
import com.iset.iset.model.RestaurentStuff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurentService {
    private final RestaurentStuffRepository repo;

    public RestaurentService(RestaurentStuffRepository repo) {
        this.repo = repo;
    }

    public RestaurentStuff addRestaurentStuff(RestaurentStuff M){
        return this.repo.save(M);
    }
    public List<RestaurentStuff> FindAllRestaurentStuff(){
        return repo.findAll();
    }
    public RestaurentStuff UpdateRestaurentStuff(RestaurentStuff CST){
        return this.repo.save(CST);
    }
    public void deleteRestaurentStuff(Long id){
        repo.deleteById(id);
    }

}
