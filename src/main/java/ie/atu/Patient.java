package ie.atu;

// r code.
public class Patient {


    public Patient(String FirstName,String FamilyName,int AgeValue,String hseNum) {
        String maxHSE = "99999999999";
        if (AgeValue > 0 && FirstName != FamilyName && hseNum  != maxHSE) {
            AgeValue = 20;
            FirstName = "John";
            FamilyName = "Burke";
            hseNum = "34567891011";
        }
        else{
            throw new IllegalArgumentException("Invalid Input");
        }
    }


}