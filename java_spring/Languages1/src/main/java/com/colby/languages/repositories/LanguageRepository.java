package com.colby.languages.repositories;

import java.util.List;
import com.colby.save.travels.save_travels.models.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

    List<Language> findAll();

    List<Language> findByDescriptionContaining(String search);

    Long countByNameContaining(String search);

    Long deleteByNameStartingWith(String search);
}