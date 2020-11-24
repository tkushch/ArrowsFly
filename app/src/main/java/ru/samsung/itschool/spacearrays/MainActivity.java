package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
    private Button b1_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        int n = intent.getIntExtra("numb", 5);
        MyDraw md = findViewById(R.id.myDraw1);
        md.setNrockets(n);
        b1_back = findViewById(R.id.back);
        b1_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == b1_back) {
            Intent intent = new Intent(this, StartPageActivity.class);
            startActivity(intent);
        }
    }
}