package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

class Sky implements Drawable {
    private Star[] stars;

    public Sky(Star[] stars) {
        this.stars = stars;
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawColor(Color.BLACK);
        for (Star star : stars) {
            star.draw(canvas, paint);
        }
    }
}