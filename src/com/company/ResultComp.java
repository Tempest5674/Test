package com.company;

public class ResultComp {
    String name;
    int weigth;

    public ResultComp(String name, int weigth) {
        this.name = name;
        this.weigth = weigth;
    }

    public int getWeigth() {
        return weigth;
    }

    @Override
    public String toString() {
        return "ResultComp{" +
                "name='" + name + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
