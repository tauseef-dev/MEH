package com.thebitteam.meh;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;



public class IssueInfo implements Parcelable {


    @SerializedName("Name")
    private String Name;


    @SerializedName("ProfName")
    private String ProfName;


    @SerializedName("DescriptionShort")
    private String DescriptionShort;


    @SerializedName("Description")
    private String Description;


    @SerializedName("MedicalCondition")
    private String MedicalCondition;


    @SerializedName("TreatmentDescription")
    private String TreatmentDescription;

    @SerializedName("Synonyms")
    private String Synonyms;


    @SerializedName("PossibleSymptoms")
    private String PossibleSymptoms;


    protected IssueInfo(Parcel in) {
        Name = in.readString();
        ProfName = in.readString();
        DescriptionShort = in.readString();
        Description = in.readString();
        MedicalCondition = in.readString();
        TreatmentDescription = in.readString();
        Synonyms = in.readString();
        PossibleSymptoms = in.readString();
    }

    public static final Creator<IssueInfo> CREATOR = new Creator<IssueInfo>() {
        @Override
        public IssueInfo createFromParcel(Parcel in) {
            return new IssueInfo(in);
        }

        @Override
        public IssueInfo[] newArray(int size) {
            return new IssueInfo[size];
        }
    };

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProfName() {
        return ProfName;
    }

    public void setProfName(String profName) {
        ProfName = profName;
    }

    public String getDescriptionShort() {
        return DescriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        DescriptionShort = descriptionShort;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMedicalCondition() {
        return MedicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        MedicalCondition = medicalCondition;
    }

    public String getTreatmentDescription() {
        return TreatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription) {
        TreatmentDescription = treatmentDescription;
    }

    public String getSynonyms() {
        return Synonyms;
    }

    public void setSynonyms(String synonyms) {
        Synonyms = synonyms;
    }

    public String getPossibleSymptoms() {
        return PossibleSymptoms;
    }

    public void setPossibleSymptoms(String possibleSymptoms) {
        PossibleSymptoms = possibleSymptoms;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Name);
        parcel.writeString(ProfName);
        parcel.writeString(DescriptionShort);
        parcel.writeString(Description);
        parcel.writeString(MedicalCondition);
        parcel.writeString(TreatmentDescription);
        parcel.writeString(Synonyms);
        parcel.writeString(PossibleSymptoms);
    }

}
