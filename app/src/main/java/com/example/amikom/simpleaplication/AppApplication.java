package com.example.amikom.simpleaplication;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.example.amikom.simpleaplication.room.AppDatabase;
import com.example.amikom.simpleaplication.room.AppDatabase;

public class AppApplication extends Application {

    public static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"mahasiswa").allowMainThreadQueries().build();
    }

}
