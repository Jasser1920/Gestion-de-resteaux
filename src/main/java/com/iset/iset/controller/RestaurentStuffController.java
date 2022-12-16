package com.iset.iset.controller;

import com.iset.iset.model.RestaurentStuff;
import com.iset.iset.service.RestaurentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurentStuffController {
    private final RestaurentService service;

    public RestaurentStuffController(RestaurentService service) {
        this.service = service;
    }
    @GetMapping("/getallRestaurentStuff")
    public ResponseEntity<List<RestaurentStuff>> getAllRestaurentStuff(){
        List<RestaurentStuff> Stuffs=service.FindAllRestaurentStuff();
        return new ResponseEntity<>(Stuffs, HttpStatus.OK);
    }
    @PostMapping("/addRestaurentStuff")
    public ResponseEntity<RestaurentStuff> AjoutRestaurentStuff(@RequestBody RestaurentStuff RS){
        RestaurentStuff RSS=service.addRestaurentStuff(RS);
        return new ResponseEntity<>(RSS, HttpStatus.CREATED);
    }

    @PostMapping(value = "/updateRestaurentStuff/{id}")
    public ResponseEntity<RestaurentStuff> UpdateRestaurentStuff(@PathVariable("id") Long id, @RequestBody RestaurentStuff Stuff){
        Stuff.setId(id);
        service.addRestaurentStuff(Stuff);
        return new ResponseEntity<>(Stuff,HttpStatus.OK);
    }

    @PostMapping(value = "/deleteRestaurentStuff/{id}")
    public ResponseEntity<RestaurentStuff> deleteRestaurentStuff(@PathVariable("id") Long id){
        service.deleteRestaurentStuff(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
