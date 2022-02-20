package main.java.com.colby.languages.languages.services;

import java.util.List;
import java.util.Optional;
import com.colby.languages.languages.models.LanguageRepository;
import main.java.models.Language;

@Service
public class LanguageService {

    @Autowired
	private LanguageRepository languageRepository;
	

    // retrieves all the languages
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    // creates an language
    public Language createLanguage(Language b) {
        return languageRepository.save(b);
    }
    // retrieves a language if it exists (optional)
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if (optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    // update a language
    public Language updateLanguage(Language language, Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if (optionalLanguage.isPresent()) {
        Language language1 = optionalLanguage.get();
        language1.setName(language.getName());
        language1.setCreator(language.getCreator());
        language1.setVersion(language.getVersion());
            return languageRepository.save(language1);
        } else {
            return null;
        } 
    }
    // delete a language
    public String delete(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if (optionalLanguage.isPresent()) {
            languageRepository.deleteById(id);
            return "Deleted";
        } else {
            return "No language to delete";
        }
    }

    public void deleteLanguage(Long id) {
    }
}