
import ie.atu.Patient;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PatientTest {
    String familyname = "Burke";
    String firstname = "John";
    int age = 20;


    @BeforeAll
    static void init()
    {
        System.out.println("Beginning of All tests");
    }
    @Test
    void testNameSuccess()
    {
     assertEquals("John",firstname);
    }

    @Test
    void testFirstNameFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class,()-> {  new Patient();});
        assertEquals("Must be a Letter not a number",exMessage.getMessage());
    }
    @Test
    void testFamilyNameSuccess(){
        assertEquals("Burke",familyname);
    }



}
