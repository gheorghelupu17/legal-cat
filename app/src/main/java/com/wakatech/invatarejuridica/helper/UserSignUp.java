package com.wakatech.invatarejuridica.helper;

public class UserSignUp {
    public String nume;
    public String email;
    public String password;
    public String judet;
    public String scoala;
    public int clasa;
    public int varsta;

    public UserSignUp(String nume, String email, String password, String judet, String scoala, int clasa, int varsta) {
        this.nume = nume;
        this.email = email;
        this.password = password;
        this.judet = judet;
        this.scoala = scoala;
        this.clasa = clasa;
        this.varsta = varsta;
    }


}
