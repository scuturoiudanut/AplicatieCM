package com.example.b2capp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    /**
     * Shows a message that the donut image was clicked.
     */
    public void showaccesoriiOrder(View view) {
        displayToast(getString(R.string.accesorii_laptop_message));
    }

    /**
     * Shows a message that the ice cream sandwich image was clicked.
     */
    public void showtelefonOrder(View view) {
        displayToast(getString(R.string.telefon_message));
    }

    /**
     * Shows a message that the froyo image was clicked.
     */
    public void showlaptopOrder(View view) {
        displayToast(getString(R.string.laptop_message));
    }

    public void onClick(View view) {
        Intent intent = new Intent(SecondActivity.this, OrderActivity.class);
        startActivity(intent);
    }




}