package com.iset.iset.controller;

import com.iset.iset.model.CuisineStuff;
import com.iset.iset.service.CuisinestuffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CuisineStuffControlller {
    private final CuisinestuffService service;

    public CuisineStuffControlller(CuisinestuffService service) {
        this.service = service;
    }
    @GetMapping("/getallCuisineStuff")
    public ResponseEntity<List<CuisineStuff>> getAllCuisine_stuff(){
        List<CuisineStuff> Stuffs=service.FindAllCuisineStuff();
        return new ResponseEntity<>(Stuffs, HttpStatus.OK);
    }
    @PostMapping("/addCuisineStuff")
    public ResponseEntity<CuisineStuff> AjoutCuisine_Stuff(@RequestBody CuisineStuff Stuff){
        CuisineStuff Stuffs=service.addCuisineStuff(Stuff);
        return new ResponseEntity<>(Stuff, HttpStatus.CREATED);
    }
    @PostMapping(value = "/updateCuisineStuff/{id}")
    public ResponseEntity<CuisineStuff> UpdateCuisine_Stuff(@PathVariable("id") Long id, @RequestBody CuisineStuff Stuff){
        Stuff.setUser_Cuisine_id(id);
        service.addCuisineStuff(Stuff);
        return new ResponseEntity<>(Stuff,HttpStatus.OK);
    }
    @PostMapping(value = "/deleteCuisineStuff/{id}")
    public ResponseEntity<CuisineStuff> deleteCuisine_Stuff(@PathVariable("id") Long id){
        service.deleteCuisineStuff(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/cuisinestuffbycommande/{id}")
    public ResponseEntity<CuisineStuff> getcuisinestuffbycommandeid(@PathVariable("id") Long id){
        CuisineStuff cuisine=service.getcuisinestuffbycommandeid(id);
        return new ResponseEntity<>(cuisine,HttpStatus.OK);
    }

}
