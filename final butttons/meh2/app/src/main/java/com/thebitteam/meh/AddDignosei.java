package com.thebitteam.meh;


public class AddDignosei {

    public String symptoms_problems;
    public String fever;
    public String BP;
    public String OtherDetails;
    public String Prescription;
    public String date;
    public String DocName;

    public AddDignosei() {
    }

    public AddDignosei(String symptoms_problems,String date,String fever, String BP, String otherDetails, String Docnmae,String prescription) {
        this.fever = fever;
        this.symptoms_problems = symptoms_problems;
        DocName = Docnmae;
        this.date=date;
        this.BP = BP;
        OtherDetails = otherDetails;
        Prescription = prescription;
    }
}

