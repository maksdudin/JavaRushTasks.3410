package com.javarush.task.task34.task3410.model;

import java.awt.*;

public class Wall extends CollisionObject{

    public Wall(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        int width = getWidth();
        int height = getHeight();
        int x1 = getX()-width/2;
         int y1 = getY() - height/2;

       graphics.setColor(new Color(187,30,16));
       //graphics.drawRect(x1,y1,width,height);// Что бы заливать необязательно предварительно делать контур
       
       graphics.fillRect(x1,y1,width,height);
    }
}
