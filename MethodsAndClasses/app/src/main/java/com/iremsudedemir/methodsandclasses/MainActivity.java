package com.iremsudedemir.methodsandclasses;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        System.out.println("on create called");
        testMethod();
        System.out.println(math(5,3));
        makeMusicians();
        makeSimpsons();
    }

    public void makeSimpsons(){
        Simpsons homer=new Simpsons("Homer",50,"Nuclear");
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());
    }

    public void makeMusicians(){
        Musicians james=new Musicians("James","Guitar",50);
        System.out.println(james.instrument);
        /*james.age=50;
        james.instrument="Guitar";
        james.name="James";*/

    }


    public void testMethod(){
        int x=4+4;
        System.out.println("value of x: "+x);
    }

    public int math(int a,int b){
        return a+b;
    }


    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on Resume called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");

    }
}