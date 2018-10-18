package com.example.amikom.simpleaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.amikom.simpleaplication.activity.AddUserActivity;
import com.example.amikom.simpleaplication.activity.DetailActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle send = getIntent().getExtras();
        TextView nama = (TextView) findViewById(R.id.nama);
        nama.setText(send.getCharSequence("nama"));
    }

    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    public void kefragment(View view) {
        Intent intent = new Intent(MainActivity.this,FragmentActivity.class);
        startActivity(intent);
    }

    public void listuser(View view) {
        Intent intent = new Intent(MainActivity.this,DetailActivity.class);
        startActivity(intent);
    }

    public void adduser(View view) {
        Intent intent = new Intent(MainActivity.this,AddUserActivity.class);
        startActivity(intent);
    }
}
