package com.reto2.repository;

import com.reto2.model.DoctorModel;
import com.reto2.repository.crudrepository.DoctorCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DoctorRepository {
    @Autowired
    private DoctorCrudRepository doctorCrudRepository;

    public List<DoctorModel> getAll() {
        return (List<DoctorModel>) doctorCrudRepository.findAll();
    }

    public Optional<DoctorModel> getDoctor(Integer id) {
        return doctorCrudRepository.findById(id);
    }

    public DoctorModel save(DoctorModel doctorModel) {
        return doctorCrudRepository.save(doctorModel);
    }

    public boolean delete(Integer id) {
        doctorCrudRepository.deleteById(id);
        return true;
    }

    public DoctorModel updateDoctor(DoctorModel doctorModel) {
        return doctorCrudRepository.save(doctorModel);
    }
}
