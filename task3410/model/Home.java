package com.javarush.task.task34.task3410.model;

import java.awt.*;

public class Home extends GameObject{
    public static final int DIM = 2;
    public Home(int x, int y) {
        super(x, y,DIM,DIM);
    }

    @Override
    public void draw(Graphics graphics) {
    graphics.setColor(Color.RED);
    int x1 = getX()-DIM/2;
    int y1 = getY()-DIM/2;
    graphics.drawOval(x1,y1,DIM,DIM);
    }
}
