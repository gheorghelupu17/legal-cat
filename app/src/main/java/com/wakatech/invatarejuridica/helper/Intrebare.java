package com.wakatech.invatarejuridica.helper;

import android.icu.text.StringSearch;
import android.support.annotation.NonNull;

import java.util.Objects;

public class Intrebare implements Comparable<Intrebare> {
    private String intrebare;
    private String raspuns1;
    private String raspuns2;
    private String raspuns3;
    private int corect1;
    private int corect2;
    private int corect3;
    public boolean answerd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intrebare intrebare1 = (Intrebare) o;
        return Objects.equals(intrebare, intrebare1.intrebare);
    }

    @Override
    public int hashCode() {

        return Objects.hash(intrebare);
    }

    public Intrebare(String intrebare, String raspuns1, String raspuns2, String raspuns3, int isCorect1, int isCorect2, int isCorect3) {
        this.intrebare = intrebare;
        this.raspuns1 = raspuns1;
        this.raspuns2 = raspuns2;
        this.raspuns3 = raspuns3;
        this.corect1 = isCorect1;
        this.corect2 = isCorect2;
        this.corect3 = isCorect3;
        this.answerd = false;
    }

    public String getIntrebare() {
        return intrebare;
    }

    public void setIntrebare(String intrebare) {
        this.intrebare = intrebare;
    }

    public String getRaspuns1() {
        return raspuns1;
    }

    public void setRaspuns1(String raspuns1) {
        this.raspuns1 = raspuns1;
    }

    public String getRaspuns2() {
        return raspuns2;
    }

    public void setRaspuns2(String raspuns2) {
        this.raspuns2 = raspuns2;
    }

    public String getRaspuns3() {
        return raspuns3;
    }

    public void setRaspuns3(String raspuns3) {
        this.raspuns3 = raspuns3;
    }

    public boolean isCorect1() {
        return corect1 == 1;
    }

    public boolean isCorect2() {
        return corect2 == 1;
    }

    public boolean isCorect3() {
        return  corect3 == 1;
    }

    @Override
    public int compareTo(@NonNull Intrebare o) {
        return this.intrebare.compareTo(o.intrebare);
    }
}
