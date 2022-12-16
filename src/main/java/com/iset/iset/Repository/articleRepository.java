package com.iset.iset.Repository;

import com.iset.iset.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface articleRepository extends JpaRepository<Article,Long> {
    @Query(value = "SELECT * FROM menu m,article a WHERE m.id_menu=a.articles_for_menu AND m.id_menu=?1",nativeQuery = true)
    List<Article> getarticleformenubyID(Long id);
}
