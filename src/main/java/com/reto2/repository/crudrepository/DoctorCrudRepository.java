package com.reto2.repository.crudrepository;

import com.reto2.model.DoctorModel;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository<DoctorModel, Integer> {
}
