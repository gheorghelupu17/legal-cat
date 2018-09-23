package com.wakatech.invatarejuridica.helper;

public class IntrebareFactory {

    public Intrebare[] question = new Intrebare[20];
    public int numberOfQuestions = 20;

    public IntrebareFactory(int level) {
        loadLevel1();
    }

    private void loadLevel1() {
        question[0] = new Intrebare("4 + 4 = ?","2","3","8",0,0,1);
        question[1] = new Intrebare("4 - 1 = ?","2","3","8",0,1,0);
        question[2] = new Intrebare("2 + 0 = ?","2","3","8",1,0,0);
        question[3] = new Intrebare("1 + 2 = ?","2","3","8",0,1,0);
        question[4] = new Intrebare("3 + 5 = ?","2","3","8",0,0,1);
        question[5] = new Intrebare("4 - 2 = ?","2","3","8",1,0,0);
        question[6] = new Intrebare("1 + 7 = ?","2","3","8",0,0,1);
        question[7] = new Intrebare("3 + 0 = ?","2","3","8",0,1,0);
        question[8] = new Intrebare("4 + 4 = ?","2","3","8",0,0,1);
        question[9] = new Intrebare("1 + 1 = ?","2","3","8",1,0,0);
        question[10] = new Intrebare("5 + 3 = ?","2","3","8",0,0,1);
        question[11] = new Intrebare("6 + 2 = ?","2","3","8",0,0,1);
        question[12] = new Intrebare("7 + 1 = ?","2","3","8",0,0,1);
        question[13] = new Intrebare("0 + 2 = ?","2","3","8",1,0,0);
        question[14] = new Intrebare("0 + 3 = ?","2","3","8",0,1,0);
        question[15] = new Intrebare("0 + 8 = ?","2","3","8",0,0,1);
        question[16] = new Intrebare("8 + 0 = ?","2","3","8",0,0,1);
        question[17] = new Intrebare("2 + 1 = ?","2","3","8",0,1,0);
        question[18] = new Intrebare("14 - 6 = ?","2","3","8",0,0,1);
        question[19] = new Intrebare("10 - 8 = ?","2","3","8",1,0,0);

    }
}
