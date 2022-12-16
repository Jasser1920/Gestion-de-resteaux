package com.iset.iset.Repository;

import com.iset.iset.model.CuisineStuff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CuisinestuffRepo extends JpaRepository<CuisineStuff,Long> {
    @Query(value = "SELECT cs.id_cuisine_stuff , cs.adresse,cs.pass,cs.email,cs.nom,cs.prenom,cs.telephone FROM commande c, cuisine_stuff cs WHERE c.id_cuisine_stuff=cs.id_cuisine_stuff AND c.id_commande =?1",nativeQuery = true)
    CuisineStuff getcousineStffbycommandeId(Long id);

}
