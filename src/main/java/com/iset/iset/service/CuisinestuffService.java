package com.iset.iset.service;

import com.iset.iset.Repository.CuisinestuffRepo;
import com.iset.iset.model.CuisineStuff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuisinestuffService {
    private final CuisinestuffRepo repo;

    public CuisinestuffService(CuisinestuffRepo repo) {
        this.repo = repo;
    }
    public CuisineStuff addCuisineStuff(CuisineStuff CS){
        return this.repo.save(CS);
    }
    public List<CuisineStuff> FindAllCuisineStuff(){
        return repo.findAll();
    }
    public CuisineStuff Update(CuisineStuff CST){
      return this.repo.save(CST);
    }
    public void deleteCuisineStuff(Long id){
        repo.deleteById(id);
    }
public CuisineStuff getcuisinestuffbycommandeid(Long id){
        return this.repo.getcousineStffbycommandeId(id);
}

}
