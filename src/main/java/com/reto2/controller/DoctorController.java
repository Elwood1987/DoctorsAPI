package com.reto2.controller;

import com.reto2.model.DoctorModel;
import com.reto2.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/all")
    public List<DoctorModel> getAll() {
        return doctorService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<DoctorModel> getDoctor(@PathVariable("id") Integer id) {
        return doctorService.getDoctor(id);
    }

    @PostMapping("/save")
    public DoctorModel save(@RequestBody DoctorModel doctorModel) {
        return doctorService.save(doctorModel);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return doctorService.delete(id);
    }

    @PutMapping("/update")
    public DoctorModel update(@RequestBody DoctorModel doctorModel){
        return doctorService.updateDoctor(doctorModel);
    }
}
