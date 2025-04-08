package ie.atu;

// r code.
public class Patient {


    public Patient(String FirstName,String FamilyName,int AgeValue) {
        if (AgeValue > 0 && FirstName != FamilyName) {
            AgeValue = 20;
            FirstName = "John";
            FamilyName = "Burke";
        }
        else{
            throw new IllegalArgumentException("Invalid Input");
        }
    }


}