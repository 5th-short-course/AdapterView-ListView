package com.example.rathana.adapterview_demo;

public class Fruit {
    private String name;
    private int thumb;

    public Fruit(String name, int thumb) {
        this.name = name;
        this.thumb = thumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }
}
