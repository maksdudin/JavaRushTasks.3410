package com.javarush.task.task34.task3410.view;

import com.javarush.task.task34.task3410.controller.EventListener;
import com.javarush.task.task34.task3410.model.*;
import com.javarush.task.task34.task3410.model.Box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;



public class Field extends JPanel {
    private View view;
    private EventListener eventListener;

    public Field(View view) {
        this.view = view;
        addKeyListener(new KeyHandler());// добавляем объект KeyHandler слушателем, событий с клавиатуры
        setFocusable(true);// туманное описание приложение ждёт событий от кого? поля?
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        Set<GameObject> gameObjects = view.getGameObjects().getAll();
        for(GameObject gameObject:gameObjects){
            gameObject.draw(g);
        }



        /*
        new Player(50,50).draw(g);
        new Box(100,50).draw(g);
        new Home(200,200).draw(g);
        new Wall(300,200).draw(g);

         */
    }
    public void setEventListener(EventListener eventListener){
       this.eventListener=eventListener;
    }
    public class KeyHandler extends KeyAdapter{
        public void keyPressed(KeyEvent e){//получаем на вход событие нажания клавиши
            int key = e.getKeyCode();// присваиваем цифровой код события переменной key
            switch (key){// сравниваем с цмфровым кодом клавиш влево вправо и т.д.
                case KeyEvent.VK_LEFT:// если совпадает то слушатель по этому событию отрабатывает
                eventListener.move(Direction.LEFT);
                break;
                case KeyEvent.VK_RIGHT:
                    eventListener.move(Direction.RIGHT);
                    break;
                case  KeyEvent.VK_DOWN:
                    eventListener.move(Direction.DOWN);
                    break;
                case KeyEvent.VK_UP:
                    eventListener.move(Direction.UP);
                    break;
                case KeyEvent.VK_R:
                    eventListener.restart();
                    break;
            }
        }
    }
}
