package main.java.com.colby.languages.languages.repositories;
import java.util.List;
import com.colby.languages.languages.models;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

    List<Language> findAll();

    List<Language> findByDescriptionContaining(String search);

    Long countByNameContaining(String search);

    Long deleteByNameStartingWith(String search);
}