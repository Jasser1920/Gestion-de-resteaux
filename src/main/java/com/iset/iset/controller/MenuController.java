package com.iset.iset.controller;

import com.iset.iset.model.CuisineStuff;
import com.iset.iset.model.Menu;
import com.iset.iset.service.CuisinestuffService;
import com.iset.iset.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuController {
    private final MenuService service;

    public MenuController(MenuService service) {
        this.service = service;
    }

    @GetMapping("/getallMenu")
    public ResponseEntity<List<Menu>> getAllMenu(){
        List<Menu> Stuffs=service.FindAllMenu();
        return new ResponseEntity<>(Stuffs, HttpStatus.OK);
    }
    @PostMapping("/addMenu")
    public ResponseEntity<Menu> AjoutMenu(@RequestBody Menu menu){
        Menu rmenu=service.addMenu(menu);
        return new ResponseEntity<>(rmenu, HttpStatus.CREATED);
    }
    @PostMapping(value = "/updateMenu/{id}")
    public ResponseEntity<Menu> UpdateCuisine_Stuff(@PathVariable("id") Long id, @RequestBody Menu Stuff){
        Stuff.setId(id);
        service.addMenu(Stuff);
        return new ResponseEntity<>(Stuff,HttpStatus.OK);
    }
    @PostMapping(value = "/deleteMenu/{id}")
    public ResponseEntity<Menu> deleteMenu(@PathVariable("id") Long id){
        service.deleteCMenu(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
