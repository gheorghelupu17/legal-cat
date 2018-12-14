package com.wakatech.invatarejuridica;

import android.support.annotation.NonNull;

class Leader implements Comparable<Leader>{
    private String name;
    private int score;


    public Leader(String name, int score) {
        this.name = name;
        this.score = score;
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

    @Override
    public int compareTo(@NonNull Leader another) {
        return Integer.compare(this.score,another.getScore());
    }
}
