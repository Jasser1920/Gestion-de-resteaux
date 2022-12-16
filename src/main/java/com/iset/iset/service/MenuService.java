package com.iset.iset.service;

import com.iset.iset.Repository.MenuRepository;
import com.iset.iset.model.CuisineStuff;
import com.iset.iset.model.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    private final MenuRepository repo;

    public MenuService(MenuRepository repo) {
        this.repo = repo;
    }
    public Menu addMenu(Menu M){
        return this.repo.save(M);
    }
    public List<Menu> FindAllMenu(){
        return repo.findAll();
    }
    public Menu UpdateMenu(Menu CST){
        return this.repo.save(CST);
    }
    public void deleteCMenu(Long id){
        repo.deleteById(id);
    }
}
