package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;

class Star extends BaseObject {
    private int color, alpha;

    public Star(int x, int y, int color, int alpha) {
        super(x, y);
        this.color = color;
        this.alpha = alpha;
    }

    public void draw(Canvas c) {

    }
}