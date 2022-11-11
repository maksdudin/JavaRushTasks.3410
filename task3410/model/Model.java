package com.javarush.task.task34.task3410.model;

import com.javarush.task.task34.task3410.controller.EventListener;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Model {
    public static final int FIELD_CELL_SIZE = 20;//размер ячейки игрового поля
    private EventListener eventListener;
    private GameObjects gameObjects;
    private int currentLevel=1;
    private LevelLoader levelLoader;
    public Model() {
        levelLoader = new LevelLoader(Paths.get("D:\\java\\JavaRushTasks\\JavaRushTasks\\" +
                "4.JavaCollections\\src\\com\\javarush\\task\\task34\\task3410\\res\\levels.txt")) ;

    }
    /* так наверное круче
    public Model() {
        try {
            levelLoader = new LevelLoader(Paths.get(getClass().getResource("../res/levels.txt").toURI()));
        } catch (URISyntaxException e) {
        }
    }
    */


    public void setEventListener(EventListener eventListener){//установка слушателя
        this.eventListener=eventListener;
    }

    public GameObjects getGameObjects() {
        return gameObjects;
    }

    public void restartLevel(int Level){
        gameObjects = levelLoader.getLevel(Level);
    }

    public void restart(){
        restartLevel(currentLevel);
    }
    public void startNextLevel(){
        currentLevel++;
        restart();
    }
    public void move(Direction direction) {

    }
}
