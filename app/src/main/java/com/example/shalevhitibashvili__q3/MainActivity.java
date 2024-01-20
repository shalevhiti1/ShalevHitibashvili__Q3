package com.example.shalevhitibashvili__q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
    }
    public void updateText(View v){
        num++;
        if (num==7){
            button.setText("Enough to click. Go to new start!");
            num=0;
        }
        else button.setText("This is a click number:"+"  "+num);
    }
}