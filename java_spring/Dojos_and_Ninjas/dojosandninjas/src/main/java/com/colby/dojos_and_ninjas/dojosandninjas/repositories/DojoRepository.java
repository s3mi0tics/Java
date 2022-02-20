package com.colby.dojos_and_ninjas.dojosandninjas.repositories;

import java.util.List;

import com.colby.dojos_and_ninjas.dojosandninjas.models.Dojo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
}
