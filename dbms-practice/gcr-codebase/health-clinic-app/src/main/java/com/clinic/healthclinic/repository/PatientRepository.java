package com.clinic.healthclinic.repository;

import com.clinic.healthclinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findByPhone(String phone);

    Optional<Patient> findByEmail(String email);
}
