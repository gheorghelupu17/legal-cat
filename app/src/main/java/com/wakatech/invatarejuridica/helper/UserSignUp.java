package com.wakatech.invatarejuridica.helper;

public class UserSignUp {
    private String nume;
    private String email;
    private String password;
    private String judet;
    private String scoala;
    private String clasa;
    private int varsta;

    public UserSignUp(String nume, String email, String password, String judet, String scoala, String clasa, int varsta) {
        this.nume = nume;
        this.email = email;
        this.password = password;
        this.judet = judet;
        this.scoala = scoala;
        this.clasa = clasa;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public String getScoala() {
        return scoala;
    }

    public int getVarsta() {
        return varsta;
    }
}
