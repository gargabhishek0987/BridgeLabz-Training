package com.clinic.healthclinic.controller;

import com.clinic.healthclinic.model.Patient;
import com.clinic.healthclinic.service.PatientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/register")
    public Patient registerPatient(@RequestBody Patient patient) {
        return patientService.registerPatient(patient);
    }
}
