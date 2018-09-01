package com.wakatech.invatarejuridica;

import android.support.annotation.NonNull;

class Leader implements Comparable<Leader>{
    private String name;
    private int score;
    private String email;

    public Leader(String name, int score, String email) {
        this.name = name;
        this.score = score;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(@NonNull Leader another) {
        return Integer.compare(this.score,another.getScore());
    }
}
