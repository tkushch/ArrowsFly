package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;


abstract class BaseObject implements Drawable {
    private int x, y;

    BaseObject(int x, int y) {
    }

    public abstract void draw(Canvas c);
}














