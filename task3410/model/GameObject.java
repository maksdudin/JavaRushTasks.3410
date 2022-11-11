package com.javarush.task.task34.task3410.model;

import java.awt.*;

public abstract class GameObject {


    // позиция и размер объекта для отрисовки
    private int x;
    private int y;
    private int width;
    private int height;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = Model.FIELD_CELL_SIZE;
        this.height = Model.FIELD_CELL_SIZE;
    }

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public abstract void draw (Graphics graphics);//тот метод будет реализован в каждом типе игровых объектов по-своему.
    
    // каждый тип игровых объектов будет знать, как он должен рисоваться и будет сам себя рисовать в графический контекст
    //Graphics - это абстрактный класс из библиотеки java.awt.
}