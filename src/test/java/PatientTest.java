
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

    String hseNum ="345567891011";


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
        Exception exMessage = assertThrows(IllegalArgumentException.class,()-> {  new Patient("John","John",20,"234567891011");});
        assertEquals("Invalid Input",exMessage.getMessage());
    }
    @Test
    void testFamilyNameSuccess()
    {
        assertEquals("Burke",familyname);
    }
    @Test
    void testFamilyNameFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class,()-> {  new Patient("John","John",20,"234567891011");});
        assertEquals("Invalid Input",exMessage.getMessage());
    }
    @Test
    void testHseSuccess(){
        assertEquals("34567891011",hseNum);
    }

    @Test
    void testHseFail(){

        Exception exMessage = assertThrows(IllegalArgumentException.class,()-> {  new Patient("John","John",20,"234567891011");});
        assertEquals("Invalid Input",exMessage.getMessage());
    }




}
