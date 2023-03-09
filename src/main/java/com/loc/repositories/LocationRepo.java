package com.loc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loc.entities.Location;

@Repository
public interface LocationRepo extends CrudRepository<Location, Integer> {

}
