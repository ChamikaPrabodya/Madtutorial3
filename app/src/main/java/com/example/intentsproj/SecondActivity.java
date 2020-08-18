package com.example.intentsproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    TextView Ans;
    EditText txt1, txt2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String N1 = intent.getStringExtra("No1");
        String N2 = intent.getStringExtra("No2");

       // Add
         txt1 = (EditText)findViewById(R.id.Number1);
         txt2 = (EditText)findViewById(R.id.Number2);
         txt1.setText(N1);
         txt2.setText(N2);


         b1 = (Button) findViewById(R.id.Add);
         Ans = (TextView)findViewById(R.id.Ans);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(txt1.getText().toString());
                int Num2 = Integer.parseInt(txt2.getText().toString());
                int tot = Num1 + Num2;
                Ans.setText(Num1 + " + " + Num2 + " = " + tot);
            }

        });

        // Minus
        txt1 = (EditText)findViewById(R.id.Number1);
        txt2 = (EditText)findViewById(R.id.Number2);
        txt1.setText(N1);
        txt2.setText(N2);


        Button button = (Button) findViewById(R.id.Minus);
        Ans = (TextView)findViewById(R.id.Ans);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(txt1.getText().toString());
                int Num2 = Integer.parseInt(txt2.getText().toString());
                int tot = Num1 - Num2;
                Ans.setText(Num1 + " - " + Num2 + " = " + tot);
            }

        });

        // Multiply
        txt1 = (EditText)findViewById(R.id.Number1);
        txt2 = (EditText)findViewById(R.id.Number2);
        txt1.setText(N1);
        txt2.setText(N2);


         b1 = (Button) findViewById(R.id.Multi);
        Ans = (TextView)findViewById(R.id.Ans);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(txt1.getText().toString());
                int Num2 = Integer.parseInt(txt2.getText().toString());
                int tot = Num1 * Num2;
                Ans.setText(Num1 + " * " + Num2 + " = " + tot);
            }

        });

        // Divide
        txt1 = (EditText)findViewById(R.id.Number1);
        txt2 = (EditText)findViewById(R.id.Number2);
        txt1.setText(N1);
        txt2.setText(N2);


         b1 = (Button) findViewById(R.id.divide );
        Ans = (TextView)findViewById(R.id.Ans);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(txt1.getText().toString());
                int Num2 = Integer.parseInt(txt2.getText().toString());
                int tot = Num1 / Num2;
                Ans.setText(Num1 + " / " + Num2 + " = " + tot);
            }

        });





        }
    }



