package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Paint;


abstract class BaseObject implements Drawable {
    private int x, y;

    BaseObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Canvas canvas, Paint paint);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}














