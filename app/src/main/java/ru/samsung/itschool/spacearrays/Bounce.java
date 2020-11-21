package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;


class Bounce extends BaseObject implements Movable, Touchable {
    private int vx, vy;
    private boolean drag = false;
    private int side = 200;
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

    public Bounce(int x, int y, int vx, int vy) {
        super(x, y);
        this.vx = vx;
        this.vy = vy;
    }

    public void touch(double x, double y) {

    }


    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }


    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setAlpha(255);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(getX() + side / 2, getY() + side / 2, side / 2, paint);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(getX() + side / 2, getY() + side / 2, side / 2 - (side / 100 * 5), paint);


    }

    public void move(Canvas canvas) {
        if (!drag) {

            int x = getX(), y = getY();

            if (x + side > canvas.getWidth() && vx >= 0) {
                if (vx == 0) {
                    vx = -5;
                } else {
                    vx = -vx;
                }
            }
            if (x < 0 && vx <= 0) {
                if (vx == 0) {
                    vx = 5;
                } else {
                    vx = -vx;
                }
            }
            if (y + side > canvas.getHeight() && vy >= 0) {
                if (vy == 0) {
                    vy = -5;
                } else {
                    vy = -vy;
                }
            }
            if (y < 0 && vy <= 0) {
                if (vy == 0) {
                    vy = 5;
                } else {
                    vy = -vy;
                }
            }

            setX(x + vx);
            setY(y + vy);

        }
    }

    public void touch() {
    }
}


