package com.thebitteam.meh;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;



public class DiagnosedIssue implements Parcelable{

    @SerializedName("ID")
    private int ID;

    @SerializedName("Icd")
    public String Icd;

    @SerializedName("IcdName")
    public String IcdName;


    @SerializedName("ProfName")
    public String ProfName;

    @SerializedName("Name")
    private String Name;


    @SerializedName("Accuracy")
    public float Accuracy;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getIcd() {
        return Icd;
    }

    public void setIcd(String icd) {
        Icd = icd;
    }

    public String getIcdName() {
        return IcdName;
    }

    public void setIcdName(String icdName) {
        IcdName = icdName;
    }

    public String getProfName() {
        return ProfName;
    }

    public void setProfName(String profName) {
        ProfName = profName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getAccuracy() {
        return Accuracy;
    }

    public void setAccuracy(float accuracy) {
        Accuracy = accuracy;
    }

    protected DiagnosedIssue(Parcel in) {
        ID = in.readInt();
        Icd = in.readString();
        IcdName = in.readString();
        ProfName = in.readString();
        Name = in.readString();
        Accuracy = in.readFloat();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ID);
        dest.writeString(Icd);
        dest.writeString(IcdName);
        dest.writeString(ProfName);
        dest.writeString(Name);
        dest.writeFloat(Accuracy);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<DiagnosedIssue> CREATOR = new Parcelable.Creator<DiagnosedIssue>() {
        @Override
        public DiagnosedIssue createFromParcel(Parcel in) {
            return new DiagnosedIssue(in);
        }

        @Override
        public DiagnosedIssue[] newArray(int size) {
            return new DiagnosedIssue[size];
        }
    };
}
