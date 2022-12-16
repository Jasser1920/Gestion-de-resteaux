package com.iset.iset.controller;

import com.iset.iset.model.Client;
import com.iset.iset.model.CuisineStuff;
import com.iset.iset.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("/getallClient")
    public ResponseEntity<List<Client>> getAllClient(){
        List<Client> Stuffs=service.afficheClient();
        return new ResponseEntity<>(Stuffs, HttpStatus.OK);
    }
    @PostMapping("/addClient")
    public ResponseEntity<Client> AjoutClient(@RequestBody Client Stuff){
        Client Stuffs=service.addClient(Stuff);
        return new ResponseEntity<>(Stuffs, HttpStatus.CREATED);
    }
    @PostMapping(value = "/updateClient/{id}")
    public ResponseEntity<Client> UpdateClient(@PathVariable("id") Long id, @RequestBody Client Stuff){
        Stuff.setId(id);
        service.addClient(Stuff);
        return new ResponseEntity<>(Stuff,HttpStatus.OK);
    }
    @PostMapping(value = "/deleteClient/{id}")
    public ResponseEntity<Client> deleteClient(@PathVariable("id") Long id){
        service.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
