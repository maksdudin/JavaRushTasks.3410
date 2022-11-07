package com.javarush.task.task34.task3410.model;

public abstract class CollisionObject extends GameObject{
    int x;
    int y;
    public CollisionObject(int x, int y) {
        super(x, y);
        this.x=x;
        this.y=y;
    }

    public boolean isCollision(GameObject gameObject, Direction direction){
    switch (direction){
        case LEFT:
            return ((x - Model.FIELD_CELL_SIZE) == gameObject.getX()) && (y == gameObject.getY());
        case RIGHT:
            return ((x + Model.FIELD_CELL_SIZE) == gameObject.getX()) && (y == gameObject.getY());
        case UP:
            return ((x == gameObject.getX() && (y - Model.FIELD_CELL_SIZE) == gameObject.getY()));
        case DOWN:
            return ((x == gameObject.getX() && (y + Model.FIELD_CELL_SIZE) == gameObject.getY()));

    }

    return false;
    }
}
