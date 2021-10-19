/* PatientServiceTest.java
 Class for the PatientServiceTest
 Author: Bilqees Saban (219090866)
  Date: 29 July 2021
*/

        package za.ac.cput.Service.Impl;

        import org.junit.jupiter.api.MethodOrderer;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.TestMethodOrder;
        import za.ac.cput.Entity.Patient;
        import za.ac.cput.Factory.PatientFactory;
        import za.ac.cput.Service.PatientService;

        import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PatientServiceTest
{
    private static PatientService service;
    private static Patient patient = PatientFactory.createPatient
            (
                    "P01",
                    "Bilqees",
                    "Saban",
                    "Female",
                    "1 Cape Town",
                    "20",
                    "0579845671",
                    "O",
                    "Negative"
            );
    private static Patient patient2 = PatientFactory.createPatient
            (
                    "P02",
                    "Rick",
                    "Allen",
                    "Female",
                    "2 Cape Town",
                    "25",
                    "0579985671",
                    "A",
                    "Positive"
            );

    @Test
    void a_createPatient()
    {
        Patient created = service.create(patient);
        Patient created2 = service.create(patient2);
        assertEquals(created.getPatID(), patient.getPatID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_readPatient()
    {
        Patient read = service.read(patient.getPatID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_updatePatient()
    {
        Patient updated = new Patient.Builder().copy(patient).setPatFirstName("Billie").build();
        assertNotNull(service.update(updated));
        System.out.println("Update: " + updated);
    }

    @Test
    void d_deletePatient()
    {
        boolean success = service.delete(patient.getPatID());
        assertTrue (success);
        System.out.println("Delete:" + success);
    }

    @Test
    void e_getAllPatient()

    {
        System.out.println("Show All:");
        System.out.println(service.getAllPatient());
    }
}