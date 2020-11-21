/*package OldClasses;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import ru.samsung.itschool.spacearrays.R;
import ru.samsung.itschool.spacearrays.Rocket1;
import ru.samsung.itschool.spacearrays.Sky1;


public class MyDraw extends View {

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		sky = new Sky1();
		rockets = new Rocket1[n];

	}

	Paint paint = new Paint();
	Bitmap rocketImage = BitmapFactory.decodeResource(getResources(), R.drawable.rocket);


	Sky1 sky;
	Rocket1[] rockets;
	int n = 5;
	int r = 0;
	boolean stopped = false;
	float[] oldvx = new float[n];
	float[] oldvy = new float[n];

	/*
	public static float rnd(float min, float max) {
		max -= min;
		return (float) (Math.random() * ++max) + min;
	}



	@Override
	protected void onDraw(Canvas canvas) {



		drawSky(canvas);
		for (int i = 0; i < n; i++) {
			rockets[i].draw(canvas, paint);
			if (r > 1000) {
				r = 0;
			}
			rockets[i].move(r, stopped, canvas);
			if (!stopped) {
				r++;
			}
		}
		invalidate();

	}

	void drawSky(Canvas canvas) {
		sky.draw(canvas, paint);
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		for (int i = 0; i < n; i++) {
			rockets[i] = new Rocket(rnd(0, w), rnd(0, h), rnd(-3f, 3f), rnd(-3f, 3f), rocketImage);
		}
	}

	@SuppressLint("ClickableViewAccessibility")
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		stopped = !stopped;
		return super.onTouchEvent(event);
	}
}
*/