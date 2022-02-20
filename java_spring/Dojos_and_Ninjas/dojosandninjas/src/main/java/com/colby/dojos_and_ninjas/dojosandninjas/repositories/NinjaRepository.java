package com.colby.dojos_and_ninjas.dojosandninjas.repositories;

import java.util.List;

import com.colby.dojos_and_ninjas.dojosandninjas.models.Ninja;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
    
}
