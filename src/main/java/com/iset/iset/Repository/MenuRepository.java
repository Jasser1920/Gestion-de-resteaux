package com.iset.iset.Repository;

import com.iset.iset.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.*;

public interface MenuRepository extends JpaRepository<Menu,Long> {

}
