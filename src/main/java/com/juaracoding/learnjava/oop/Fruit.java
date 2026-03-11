package com.juaracoding.learnjava.oop;

public class Fruit {
    int grams;
    double calsPerGram;

    double calculateCalories() {
        return grams * calsPerGram;
    }
}
