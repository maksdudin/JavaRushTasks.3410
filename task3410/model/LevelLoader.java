package com.javarush.task.task34.task3410.model;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class LevelLoader {
    private Path levels;// пути к текстовому файлу, содержащему описание уровней

    public LevelLoader(Path levels) {
        this.levels = levels;
    }

    public GameObjects getLevel(int level){
        Set<Wall> walls = new HashSet<>();
        Set<Box> boxes = new HashSet<>();
        Set<Home> homes = new HashSet<>();
        int x;
        int y;
        int count=1;
        for(int i = 1 ; i<4 ; i++){
            if(i==1){
                x = cor(count);
                y = x;
                walls.add(new Wall(x,y));
                count++;
            }
        x = cor(count);
        y = x;
        walls.add(new Wall(x,y));
        count++;
        }
        boxes.add(new Box(cor(count),cor(count)));
        count++;
        homes.add(new Home(cor(count),cor(count)));
        count++;
        Player player =new Player(cor(count),cor(count));

        return new GameObjects(walls,boxes,homes,player);
    }
    public int cor(int count){
        if(count==1){
            return count*Model.FIELD_CELL_SIZE/2;
        }
        return count * Model.FIELD_CELL_SIZE/2 + Model.FIELD_CELL_SIZE*count;
    }
}
