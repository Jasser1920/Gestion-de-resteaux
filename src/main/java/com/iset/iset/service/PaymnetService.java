package com.iset.iset.service;

import com.iset.iset.Repository.PaymentRepo;
import com.iset.iset.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymnetService {
    private final PaymentRepo repo;


    public PaymnetService(PaymentRepo repo) {
        this.repo = repo;
    }
    public List<Payment> getAllPayment(){
        return this.repo.findAll();
    }
public Payment addPayment(Payment Pay){
        return this.repo.save(Pay);

}
public void deletePayment(Long id_payment){
        repo.deleteById(id_payment);
}
public Payment updatePayment(Payment Pay){
        return this.repo.save(Pay);
}
}
