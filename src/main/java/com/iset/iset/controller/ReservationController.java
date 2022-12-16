package com.iset.iset.controller;

import com.iset.iset.model.Payment;
import com.iset.iset.model.Reservation;
import com.iset.iset.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {
    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }
    @GetMapping("/getallReservation")
    public ResponseEntity<List<Reservation>> getAllPayment(){
        List<Reservation> Pays=service.FindAllReservation();
        return new ResponseEntity<>(Pays, HttpStatus.OK);
    }
    @PostMapping("/addReservation")
    public ResponseEntity<Reservation> ajoutPayment(@RequestBody Reservation Res){
        Reservation Pays=service.addReservation(Res);
        return new ResponseEntity<>(Pays, HttpStatus.CREATED);
    }
    @PostMapping(value = "/updateReservation/{id}")
    public ResponseEntity<Reservation> UpdatePayment(@PathVariable("id") Long id, @RequestBody Reservation Pay){
        Pay.setId(id);
        service.UpdateReservation(Pay);
        return new ResponseEntity<>(Pay,HttpStatus.OK);
    }
    @PostMapping(value = "/deleteReservation/{id}")
    public ResponseEntity<Reservation> DeletePayment(@PathVariable("id") Long id){
        service.deleteReservation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
