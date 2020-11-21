package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.MotionEvent;

class Rocket extends BaseObject implements Movable, Touchable {
    private Bitmap image;
    private int vx, vy;
    private boolean drag = false;
    private int side = 600;
    private int dragX;
    private int dragY;

    public int getDragX() {
        return dragX;
    }

    public void setDragX(int dragX) {
        this.dragX = dragX;
    }

    public int getDragY() {
        return dragY;
    }

    public void setDragY(int dragY) {
        this.dragY = dragY;
    }

    public int getSide() {
        return side;
    }

    public boolean isDrag() {
        return drag;
    }

    public void setDrag(boolean drag) {
        this.drag = drag;
    }

    public Rocket(Bitmap img, int x, int y, int vx, int vy) {
        super(x, y);
        this.vx = vx;
        this.vy = vy;
        this.image = img;
    }

    public void touch(double x, double y) {

    }


    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }


    @Override
    public void draw(Canvas canvas, Paint paint) {
        Matrix matrix = new Matrix();
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        matrix.postRotate((float) Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(getX(), getY());
        paint.setAlpha(255);
        canvas.drawBitmap(image, matrix, paint);

    }

    public void move(Canvas canvas) {
        if (!drag) {
            int x = getX(), y = getY();
            if (x > canvas.getWidth() && vx > 0) vx = -vx;
            if (x < 0 && vx < 0) vx = -vx;
            if (y > canvas.getHeight() && vy > 0) vy = -vy;
            if (y < 0 && vy < 0) vy = -vy;
            setX(x + vx);
            setY(y + vy);
        }
    }

    public void touch() {
    }
}

