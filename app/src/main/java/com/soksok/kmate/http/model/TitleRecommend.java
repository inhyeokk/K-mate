package com.soksok.kmate.http.model;

import java.util.ArrayList;

public class TitleRecommend {
    private ArrayList<Recommend> eat;
    private ArrayList<Recommend> info;
    private ArrayList<Recommend> attr;

    public ArrayList<Recommend> getEat() {
        return eat;
    }

    public void setEat(ArrayList<Recommend> eat) {
        this.eat = eat;
    }

    public ArrayList<Recommend> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<Recommend> info) {
        this.info = info;
    }

    public ArrayList<Recommend> getAttr() {
        return attr;
    }

    public void setAttr(ArrayList<Recommend> attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "TitleRecommend{" +
                "eat=" + eat +
                ", info=" + info +
                ", attr=" + attr +
                '}';
    }
}
