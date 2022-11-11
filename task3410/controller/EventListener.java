package com.javarush.task.task34.task3410.controller;

import com.javarush.task.task34.task3410.model.Direction;

public interface EventListener {
    void move(Direction direction);// передвинуть обьект в орпеделенном направлении
    void restart();// начать занового текущий уровень
    void startNextLevel();// начать следующий уровень
    void levelCompleted(int level);

}
