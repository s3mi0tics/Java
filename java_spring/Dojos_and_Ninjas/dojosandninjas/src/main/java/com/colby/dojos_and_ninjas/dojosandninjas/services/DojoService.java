package com.colby.dojos_and_ninjas.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import com.colby.dojos_and_ninjas.dojosandninjas.models.Dojo;
import com.colby.dojos_and_ninjas.dojosandninjas.repositories.DojoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DojoService {
    @Autowired
    private DojoRepository dojoRepository;

      // retrieves all the dojos
      public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    // creates an dojo
    public Dojo createDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }
    // retrieves a dojo if it exists (optional)
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if (optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
    // update a dojo
    public Dojo updateDojo(Dojo d) {
        return dojoRepository.save(d);
    }

    // delete a dojo
    public String delete(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if (optionalDojo.isPresent()) {
            dojoRepository.deleteById(id);
            return "Deleted";
        } else {
            return "No dojo to delete";
        }
    }
}
