package com.example.mobimoveEmployee;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.cr
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestRepository extends CrudRepository <Employee , Long> {

}
