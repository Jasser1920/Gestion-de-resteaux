package com.iset.iset.controller;

import com.iset.iset.model.CuisineStuff;
import com.iset.iset.model.Commande;
import com.iset.iset.service.commandeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class commandeController {
    private final commandeService service;

    public commandeController(commandeService service) {
        this.service = service;
    }
    @GetMapping("/getallcommande")
    public ResponseEntity<List<Commande>> getAllcommande(){
        List<Commande> cmds=service.getAllCommande();
        return new ResponseEntity<>(cmds, HttpStatus.OK);
    }
    @PostMapping("/addcommande")
    public ResponseEntity<Commande> Ajoutcommande(@RequestBody Commande cmd){

        Commande comd=service.addCommande(cmd);
        return new ResponseEntity<>(comd, HttpStatus.CREATED);

    }
    @PostMapping(value = "/deletecommande/{id}")
    public ResponseEntity<Commande> deleteCuisine_Stuff(@PathVariable("id") Long id){
        service.deleteCommande(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("toutLesCommandeDeCuisineStuffById/{id}/commande")
    public ResponseEntity<List<Commande>> toutLesCommandeDeCuisineStuffById (@PathVariable("id") Long id){
        List<Commande> resu=service.toutLesCommandeDeCuisineStuffById(id);
        return new ResponseEntity<>(resu, HttpStatus.OK);
    }

}
