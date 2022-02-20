package com.colby.dojos_and_ninjas.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import com.colby.dojos_and_ninjas.dojosandninjas.models.Ninja;
import com.colby.dojos_and_ninjas.dojosandninjas.repositories.NinjaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepository;

      // retrieves all the ninjas
      public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
    // creates an ninja
    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
    // retrieves a ninja if it exists (optional)
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if (optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    // update a ninja
    public Ninja updateNinja(Ninja d) {
        return ninjaRepository.save(d);
    }

    // delete a ninja
    public String delete(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if (optionalNinja.isPresent()) {
            ninjaRepository.deleteById(id);
            return "Deleted";
        } else {
            return "No ninja to delete";
        }
    }
}
