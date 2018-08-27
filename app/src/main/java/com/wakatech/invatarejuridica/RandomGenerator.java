package com.wakatech.invatarejuridica;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {

    private RandomGenerator() {}

    static private int[] colors = {
            0xffab1323,0xffc5e7cf,
            0xff7fbfff,0xfff69d3a,
            0xff172d51,0xfff75a56,
            0xff945aca,0xff008080,
            0xff550911,0xfff49c98
    };

    static private String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };

    static public int generateInt(int bound) {
        Random random = new Random();
        int random_nr =  random.nextInt(bound);
        return random_nr;
    }

    static public int generateColor() {
        int randomNumber = generateInt(colors.length);
        return colors[randomNumber];
    }

    static public String generateFact() {
        int randomNumber = generateInt(facts.length);
        return facts[randomNumber];
    }

}
