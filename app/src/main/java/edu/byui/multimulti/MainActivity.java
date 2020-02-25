package edu.byui.multimulti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void countByOdd(View v) {

        OddCounter oc = new OddCounter();

        oc.activity = this;

        Thread th = new Thread(oc);
        th.start();

    }


    public void countByEven(View v) {


        EvenCounter ec = new EvenCounter();

        ec.activity = this;

        Thread th = new Thread(ec);
        th.start();


    }


}
