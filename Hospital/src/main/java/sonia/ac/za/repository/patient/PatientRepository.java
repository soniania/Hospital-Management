package sonia.ac.za.repository.patient;

import sonia.ac.za.domain.patient.Patient;
import sonia.ac.za.repository.RepositoryInt;
//import org.springframework.stereotype.RepositoryInt;
import  java.util.Set;


public interface PatientRepository extends RepositoryInt<Patient, String> {
    Set<Patient> getAll();
}

