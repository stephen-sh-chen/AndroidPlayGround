package com.example.stephen.mynewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.button);

        myButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView myText = (TextView) findViewById(R.id.textView2);
                        myText.setText("Hello World Button Clicked");
                    }
                }
        );

        myButton.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView myText = (TextView) findViewById(R.id.textView2);
                        myText.setText("Hello 277 Long clicked");
                        return true;
                    }
                }
        );
    }
}
