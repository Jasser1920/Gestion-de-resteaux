package com.iset.iset.Repository;

import com.iset.iset.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository <Reservation,Long> {
}
