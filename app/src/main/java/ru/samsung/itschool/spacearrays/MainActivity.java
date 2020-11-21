package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
    public boolean onTouchEvent(MotionEvent event) {
        double x = event.getX();
        double y = event.getY();
        // bos - это массив обджектов
        BaseObject[] bos = new BaseObject[0];
        for (BaseObject b : bos) {
            if (b instanceof Touchable) {
                ((Touchable) b).touch(x, y);
            }
        }
        return false;
    }

 */
//ретурн тру все касания (можно перемещать)
// ретурн фолз только первое
}