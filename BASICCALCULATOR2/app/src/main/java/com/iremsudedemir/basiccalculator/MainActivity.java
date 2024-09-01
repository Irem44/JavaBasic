package com.iremsudedemir.basiccalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
      EditText number1Text;
      EditText number2Text;

      TextView resaultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        number1Text=findViewById(R.id.editText1);
        number2Text=findViewById(R.id.editText2);
        resaultText=findViewById(R.id.textView1);
    }

    public void sum(View view){
          if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
              resaultText.setText("Enter Number");
          }
          else{
              int number1=Integer.parseInt(number1Text.getText().toString());
              int number2=Integer.parseInt(number2Text.getText().toString());
              int resault=number1+number2;
              resaultText.setText("Sonuç: "+resault);
          }
    }

    public void subtraction(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resaultText.setText("Enter Number");
        }
        else{
            int number1=Integer.parseInt(number1Text.getText().toString());
            int number2=Integer.parseInt(number2Text.getText().toString());
            int resault=number1-number2;
            resaultText.setText("Sonuç: "+resault);
        }
    }

    public void multiplication(View view){
        if(number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){
            resaultText.setText("Enter Number");
        }
        else{
            int number1=Integer.parseInt(number1Text.getText().toString());
            int number2=Integer.parseInt(number2Text.getText().toString());
            int resault=number1*number2;
            resaultText.setText("Sonuç: "+resault);
        }
    }

    public void divide(View view){
        if(number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){
            resaultText.setText("Enter Number");
        }

        else{
            int number1=Integer.parseInt(number1Text.getText().toString());
            int number2=Integer.parseInt(number2Text.getText().toString());
            int resault=number1/number2;
            resaultText.setText("Sonuç: "+resault);
        }
    }
}