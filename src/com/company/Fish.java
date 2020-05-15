package com.company;

import java.util.Calendar;

public class Fish {
    TypeOfFish typeOfFish;
    int weight;
    Calendar timeOfCaught;

    public Fish(TypeOfFish typeOfFish, int weight, Calendar timeOfCaught) {
        this.typeOfFish = typeOfFish;
        this.weight = weight;
        this.timeOfCaught = timeOfCaught;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "typeOfFish=" + typeOfFish +
                ", weight=" + weight+"}";
    }

}
