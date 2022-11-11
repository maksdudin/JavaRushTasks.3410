package com.javarush.task.task34.task3410.model;

import java.awt.*;

public class Box extends CollisionObject implements Movable{


    public Box(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        int xc = getX();
        int yc = getY();
        int width = getWidth();
        int height = getHeight();
        graphics.setColor(Color.orange);
        graphics.drawRect(xc-width/2,yc-height/2,width,height);

        //graphics.setColor(Color.orange);
        //graphics.fillRect((xc-width/2)+1,(yc-height/2)+1,width-1,height-1);


        graphics.drawLine(xc - width / 2,yc - height / 2,xc + width / 2,yc + height / 2);
        graphics.drawLine(xc - width / 2,yc + height / 2,xc + width / 2,yc - height / 2);


    }

    @Override
    public void move(int x, int y) {
    this.x+=x;
    this.y+=y;
    }



}
