package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFormatException;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class StartPageActivity extends Activity implements View.OnClickListener {
    private Button b1;
    private EditText editText;
    private TextView message;
    private boolean isok = false;
    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);
        b1 = findViewById(R.id.begin);
        b1.setOnClickListener(this);
        message = findViewById(R.id.textView5);
        editText = findViewById(R.id.edittext);

    }


    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.begin)) {
            try {
                n = Integer.parseInt(editText.getText().toString());
                if (n < 500) {
                    isok = true;
                }

            } catch (java.lang.NumberFormatException e) {
                message.setText("Некорректное значение");
                isok = false;
            }
            if (isok) {
                message.setText("Введите количество ракет");
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("numb", n);
                startActivity(intent);
            } else {
                message.setText("Некорректное значение");
            }


        }
    }


}

/*

 */