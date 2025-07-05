package com.nk.service.doctor;

import com.nk.dao.doctor.DoctorRepository;
import com.nk.mailservice.EmailService;
import com.nk.model.doctor.Doctor;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Autowired
    private EmailService service;

    @PostConstruct
    public void initDoctor(){
        repository.saveAll(Stream.of
                (new Doctor(101, "John", "Cardiac"),
                        new Doctor(102, "Peter", "Eye"))
                .collect(Collectors.toList()));

    }

    public List<Doctor> getDoctors(){
        service.sendEmail();
        return repository.findAll();
    }


}
