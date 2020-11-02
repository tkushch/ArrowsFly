package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
//smth new
public class Rocket {
    float x, y, vx, vy;
    Bitmap image;

    Rocket(float x, float y, float vx, float vy, Bitmap image){
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.image = image;
    }

    void move(int r, boolean stopped, Canvas canvas){
        if (!stopped) {
            if (x > canvas.getWidth() && vx > 0) vx = - vx;
            if (x < 0 && vx < 0) vx = - vx;
            if (y > canvas.getHeight() && vy > 0) vy = - vy;
            if (y < 0 && vy < 0) vy = - vy;
            x += vx;
            y += vy;
        }
    }

    void draw(Canvas canvas, Paint paint){
        Matrix matrix = new Matrix();
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(image, matrix, paint);
    }

}

