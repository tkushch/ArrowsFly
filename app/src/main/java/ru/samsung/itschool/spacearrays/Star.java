package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Paint;

class Star extends BaseObject implements Drawable {
    private int color, alpha;

    public Star(int x, int y, int color, int alpha) {
        super(x, y);
        this.color = color;
        this.alpha = alpha;
    }

    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(color);
        paint.setAlpha(alpha);
        paint.setStrokeWidth(2);
        alpha += (int) (Math.random() * 11) - 5;
        if (alpha > 255) alpha = 255;
        if (alpha < 0) alpha = 0;
        canvas.drawCircle(getX(), getY(), 3, paint);
    }
}