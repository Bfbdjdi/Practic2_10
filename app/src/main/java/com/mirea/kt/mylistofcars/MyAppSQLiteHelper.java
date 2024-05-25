package com.mirea.kt.mylistofcars;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyAppSQLiteHelper extends SQLiteOpenHelper {
    public MyAppSQLiteHelper(Context c, String num,
                             SQLiteDatabase.CursorFactory f, int version) {
        super(c, num, f, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + "TABLE_CARS" + " ("
                + "_id integer primary key autoincrement,"
                + "brand text,"
                + "number text,"
                + "year integer" + ");");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
    }

}
