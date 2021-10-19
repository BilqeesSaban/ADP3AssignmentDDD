/* PatientService.java
 Class for the PatientService
 Author: Bilqees Saban (219090866)
  Date: 29 July 2021
*/

package za.ac.cput.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Entity.Patient;
import za.ac.cput.Repository.IPatientRepository;

import javax.persistence.EntityNotFoundException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PatientService implements IPatientService
{
    private final IPatientRepository repository;

    @Autowired
    private PatientService(IPatientRepository repository)
    {
        this.repository =repository;
    }

    @Override
    public Patient create(Patient patient)
    {
        return this.repository.save(patient);
    }

    @Override
    public Patient read(String patID)
        {
            return this.repository.findById(patID).orElseThrow(() -> new EntityNotFoundException("Patient with id " + patID + " was not found" ));

        }

    @Override
    public Patient update(Patient patient)
    {
        if(this.repository.existsById(patient.getPatID()))
            return this.repository.save(patient);
        return null;
    }

    @Override
    public boolean delete(String patID)
    {
        this.repository.deleteById(patID);
        if(this.repository.existsById(patID))
            return false;
        else
            return true;
    }

    @Override
    public Set<Patient> getAllPatient()
    {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
