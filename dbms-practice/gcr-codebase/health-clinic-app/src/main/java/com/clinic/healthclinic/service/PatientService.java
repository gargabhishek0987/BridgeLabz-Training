package com.clinic.healthclinic.service;

import com.clinic.healthclinic.model.Patient;
import com.clinic.healthclinic.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient registerPatient(Patient patient) {

        if (patientRepository.findByPhone(patient.getPhone()).isPresent()) {
            throw new RuntimeException("Phone number already exists");
        }

        if (patientRepository.findByEmail(patient.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }

        return patientRepository.save(patient);
    }
}
