package ru.samsung.itschool.spacearrays;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class MyDraw extends View {
    private Sky sky;
    private Star[] stars;
    //private Rocket[] rockets;
    private Bounce[] bounces;
    private int nrockets = 500;
    private int nstars = 550;
    private boolean first = true;
    private Paint paint = new Paint();
    //private Bitmap rocketImage = BitmapFactory.decodeResource(getResources(), R.drawable.rocket);


    public MyDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.sky = new Sky(stars);
        this.stars = new Star[nstars];
        //this.rockets = new Rocket[nrockets];
        this.bounces = new Bounce[nrockets];
    }

    public void setNrockets(int nrockets) {
        this.nrockets = nrockets;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        if (first) {
            first = false;
            for (int i = 0; i < nrockets; i++) {
                /*
                rockets[i] = new Rocket(
                        rocketImage,
                        getWidth() / 2,
                        getHeight() / 2,
                        rnd(-5, 5),
                        rnd(-5, 5)
                );

                 */
                bounces[i] = new Bounce(
                        getWidth() / 2,
                        getHeight() / 2,
                        rnd(-5, 5),
                        rnd(-5, 5)
                );
            }
            for (int i = 0; i < nstars; i++) {
                stars[i] = new Star(
                        rnd(0, getWidth()),
                        rnd(0, getHeight()),
                        Color.YELLOW,
                        (int) (Math.random() * 256)
                );
            }
            sky = new Sky(stars);
        }
        sky.draw(canvas, paint);
        /*
        for (Rocket rocket : rockets) {
            rocket.draw(canvas, paint);
            rocket.move(canvas);
        }

         */
        for (int i = 0; i < nrockets; i++) {
            bounces[i].draw(canvas, paint);
            bounces[i].move(canvas);
        }
        invalidate();
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    protected int rnd(int min, int max) {
        max -= min;
        return (int) ((Math.random() * (max + 1) + min));
    }

    /*
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) getX();
        int y = (int) getY();
        for (Rocket rocket: rockets){
            int rx = rocket.getX();
            int ry = rocket.getY();

        }
        return false;
    }
     */


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // координаты Touch-события
        int evX = (int) event.getX();
        int evY = (int) event.getY();
        for (int i = 0; i < nrockets; i++) {
            int x = bounces[i].getX();
            int y = bounces[i].getY();
            int side = bounces[i].getSide();

            switch (event.getAction()) {
                // касание началось
                case MotionEvent.ACTION_DOWN:
                    // если касание было начато в пределах квадрата
                    if (evX >= x && evX <= x + side && evY >= y && evY <= y + side) {
                        // включаем режим перетаскивания
                        bounces[i].setDrag(true);
                        // разница между левым верхним углом квадрата и точкой касания
                        bounces[i].setDragX(evX - x);
                        bounces[i].setDragY(evY - y);
                    }
                    break;
                // тащим
                case MotionEvent.ACTION_MOVE:
                    // если режим перетаскивания включен
                    if (bounces[i].isDrag()) {
                        // определеяем новые координаты для рисования
                        bounces[i].setX(evX - bounces[i].getDragX());
                        bounces[i].setY(evY - bounces[i].getDragY());
                        // перерисовываем экра
                        invalidate();
                    }
                    break;
                // касание завершено
                case MotionEvent.ACTION_UP:
                    // выключаем режим перетаскивания
                    bounces[i].setDrag(false);
                    break;
            }
        }
        return true;
    }
}
