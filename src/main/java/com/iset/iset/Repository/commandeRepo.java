package com.iset.iset.Repository;

import com.iset.iset.model.CuisineStuff;
import com.iset.iset.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface commandeRepo extends JpaRepository<Commande,Long> {






    @Query(value = "SELECT * FROM commande c WHERE c.id_cuisine_stuff=?1",nativeQuery = true)
    List<Commande> toutLesCommandeDeCuisineStuffById(Long id);

}
