package com.iset.iset.service;

import com.iset.iset.Repository.ReservationRepo;
import com.iset.iset.model.Reservation;
import com.iset.iset.model.RestaurentStuff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepo repo;

    public ReservationService(ReservationRepo repo) {
        this.repo = repo;
    }

    public Reservation addReservation(Reservation M){
        return this.repo.save(M);
    }
    public List<Reservation> FindAllReservation(){
        return repo.findAll();
    }
    public Reservation UpdateReservation(Reservation CST){
        return this.repo.save(CST);
    }
    public void deleteReservation(Long id){
        repo.deleteById(id);
    }

}
