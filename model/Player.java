package com.javarush.task.task34.task3410.model;

import java.awt.*;

public class Player extends CollisionObject implements Movable{


    public Player(int x, int y) {
        super(x,y);

    }

    @Override
    public void draw(Graphics graphics) {
        int xc = getX();
        int yc = getY();
        int width = getWidth();
        int height = getHeight();
        graphics.setColor(Color.YELLOW);
        graphics.drawOval(xc-width/2,yc-height/2,width,height);
        graphics.fillOval(xc-width/2,yc-height/2,width,height);
    }

    @Override
    public void move(int x, int y) {
        this.x+=x;
        this.y+=y;
    }
}
