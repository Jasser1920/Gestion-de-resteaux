package com.iset.iset.controller;

import com.iset.iset.model.Payment;
import com.iset.iset.service.PaymnetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PaymentController {
    private final PaymnetService service;

    public PaymentController(PaymnetService service) {
        this.service = service;
    }
@GetMapping("/getallPayment")
public ResponseEntity<List<Payment>> getAllPayment(){
    List<Payment> Pays=service.getAllPayment();
return new ResponseEntity<>(Pays, HttpStatus.OK);
}
    @PostMapping("/addpayment")
    public ResponseEntity<Payment> ajoutPayment(@RequestBody Payment Pay){
        Payment Pays=service.addPayment(Pay);
        return new ResponseEntity<>(Pays, HttpStatus.CREATED);
    }
    @PostMapping(value = "/updatepayment/{id}")
    public ResponseEntity<Payment> UpdatePayment(@PathVariable("id") Long id, @RequestBody Payment Pay){
        Pay.setId_paymnet(id);
        service.updatePayment(Pay);
        return new ResponseEntity<>(Pay,HttpStatus.OK);
    }
    @PostMapping(value = "/deletepayment/{id}")
    public ResponseEntity<Payment> DeletePayment(@PathVariable("id") Long id){
        service.deletePayment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
