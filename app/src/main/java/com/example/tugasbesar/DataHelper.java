package com.example.tugasbesar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "daftalagu.db";
    private static final Integer DATABASE_VERTSION = 1;
    public DataHelper(Context context) {
        super (context, DATABASE_NAME,null,DATABASE_VERTSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         String sql = "create tabel daftar lagu (no integer primary key, judul text null);";
        Log.d("data" "onCreate: "+sql);
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
