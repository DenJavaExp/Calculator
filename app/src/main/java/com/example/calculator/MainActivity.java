package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button:
                        editText.setText(" ");
                        break;
                    case R.id.button2:
                        editText.setText("-");
                        break;
                    case R.id.button3:
                        editText.setText("%");
                        break;
                    case R.id.button4:
                        editText.setText("1");
                        break;
                    case R.id.button5:
                        editText.setText("2");
                        break;
                    case R.id.button6:
                        editText.setText("3");
                        break;
                    case R.id.button7:
                        editText.setText("/");
                        break;
                    case R.id.button8:
                        editText.setText("4");
                        break;
                    case R.id.button9:
                        editText.setText("5");
                        break;
                    case R.id.button10:
                        editText.setText("6");
                        break;
                    case R.id.button11:
                        editText.setText("*");
                        break;
                    case R.id.button12:
                        editText.setText("7");
                        break;
                    case R.id.button13:
                        editText.setText("8");
                        break;
                    case R.id.button14:
                        editText.setText("9");
                        break;
                    case R.id.button15:
                        editText.setText("-");
                        break;
                    case R.id.button16:
                        editText.setText("0");
                        break;
                    case R.id.button17:
                        editText.setText(",");
                        break;
                    case R.id.button18:
                        editText.setText("+");
                        break;
                    case R.id.button19:
                        editText.setText("=");
                        break;
                }
            }
        };

        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        button10.setOnClickListener(onClickListener);
        button11.setOnClickListener(onClickListener);
        button12.setOnClickListener(onClickListener);
        button13.setOnClickListener(onClickListener);
        button14.setOnClickListener(onClickListener);
        button15.setOnClickListener(onClickListener);
        button16.setOnClickListener(onClickListener);
        button17.setOnClickListener(onClickListener);
        button18.setOnClickListener(onClickListener);
        button19.setOnClickListener(onClickListener);


    }


}