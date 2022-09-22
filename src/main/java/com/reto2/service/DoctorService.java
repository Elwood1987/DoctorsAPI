package com.reto2.service;

import com.reto2.model.DoctorModel;
import com.reto2.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<DoctorModel> getAll() {
        return doctorRepository.getAll();
    }

    public Optional<DoctorModel> getDoctor(Integer id) {
        return doctorRepository.getDoctor(id);
    }

    public DoctorModel save(DoctorModel doctorModel) {
        return doctorRepository.save(doctorModel);
    }

    public boolean delete(Integer id) {
       return doctorRepository.delete(id);
    }

    public DoctorModel updateDoctor(DoctorModel doctorModel) {
        return doctorRepository.updateDoctor(doctorModel);
    }
}
