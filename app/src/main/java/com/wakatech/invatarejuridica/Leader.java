package com.wakatech.invatarejuridica;

import android.support.annotation.NonNull;

class Leader {
    public String name;
    public String intrebari;
    public String email;

    public Leader(String name, String intrebari, String email) {
        this.name = name;
        this.intrebari = intrebari;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        char chars[] = intrebari.toCharArray();
        int score = 0;
        for (char c : chars)
        {
            switch (c)
            {
                case '1':
                    score+=8;
                    break;
                case '2':
                    score+=9;
                    break;
                case '3':
                    score+=10;
                    break;
            }
        }
        return score;
    }

    public void setScore(String intrebari) {
        this.intrebari = intrebari;
    }


}
