package com.thebitteam.meh;

import com.google.gson.annotations.SerializedName;



public class AccessToken {

    @SerializedName("Token")
    private String Token;


    @SerializedName("ValidThrough")
    private int ValidThrough;

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public int getValidThrough() {
        return ValidThrough;
    }

    public void setValidThrough(int validThrough) {
        ValidThrough = validThrough;
    }

}
