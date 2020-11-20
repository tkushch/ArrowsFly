package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;

class Rocket1 extends BaseObject implements Movable, Touchable {
    private Bitmap img;
    private Double vx, vy;

    public Rocket1(Bitmap img, int x, int y, double vx, double vy) {
        super(x, y);
    }

    public void touch(double x, double y) {

    }


    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public void draw(Canvas c) {

    }

    public void move() {

    }

    public void touch() {

    }
}
