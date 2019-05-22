package sonia.ac.za.repository.patient.impl;

import sonia.ac.za.domain.patient.Patient;
import sonia.ac.za.repository.patient.PatientRepository;


import java.util.*;
public class PatientRepositoryImpl implements PatientRepository {

    private static PatientRepositoryImpl repository = null;
    private Map<String, Patient> patients;

    private PatientRepositoryImpl()
    {
        this.patients = new HashMap<>();
    }

    public static PatientRepository getRepository(){
        if(repository == null) repository = new PatientRepositoryImpl();
        return repository;
    }

    public Patient create(Patient patient){
        this.patients.put(patient.getPatientId(),patient);
        return patient;
    }

    public Patient read(String patientId){
        return this.patients.get(patientId);
    }

    public Patient update(Patient patient){
        this.patients.replace(patient.getPatientId(), patient);
        return this.patients.get(patient.getPatientId());
    }

    public void delete(String patientId) {
        this.patients.remove(patientId);
    }

    public Set<Patient> getAll(){
        Collection<Patient> patients = this.patients.values();
        Set<Patient> set = new HashSet<>();
        set.addAll(patients);
        return set;
    }


}
