package com.javarush.task.task34.task3410.controller;

import com.javarush.task.task34.task3410.model.Direction;
import com.javarush.task.task34.task3410.model.GameObjects;
import com.javarush.task.task34.task3410.model.Model;
import com.javarush.task.task34.task3410.view.View;

public class Controller implements EventListener{
    private View view;
    private Model model;
    public Controller() {
        this.view = new View(this);
        this.model = new Model();
        view.init();
        model.restart();
        model.setEventListener(this);// установка слушателя событий в модели
        view.setEventListener(this);// установка слушателя событий в представления
        // слушатель сам контроллер  - this
    }
    public GameObjects getGameObjects(){
        return model.getGameObjects();
    }

    public static void main(String[] args) {
    Controller controller = new Controller();

    }

    @Override
    public void move(Direction direction) {
        model.move(direction);// вызываем метод move у модели
        view.update();// м перерисовываем поле после изменения в модели
    }

    @Override
    public void restart() {
        model.restart();// перезапускаем модель
        view.update();// и обновляем представление
    }

    @Override
    public void startNextLevel() {
        model.startNextLevel();
        view.update();
    }

    @Override
    public void levelCompleted(int level) {
        view.completed(level);
    }
}
