package com.noosbit.wikimx;


import java.io.OutputStream;
import java.util.Locale;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by learanzeta on 6/19/13.
 */

class LugaresHelper extends SQLiteOpenHelper{

    private static final String DATABASE_PATH = "/data/data/com.noosbit.wikimx/databases/";
    private static final String DATABASE_NAME = "WikiMexico.db";
    private static final int SCHEMA_VERSION = 1;
    public SQLiteDatabase dbSqlite;

    private final Context myContext;

    public LugaresHelper (Context context){
        super(context, DATABASE_NAME, null, SCHEMA_VERSION);
        this.myContext = context;


    }


@Override
    public void onCreate(SQLiteDatabase db){


}

@Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){


}


public void createDataBase(){
    createdb();
}
public void createdb(){
    //boolean dbExist = DBExists();
  //  if (!dbExist){
    //    this.getReadableDatabase();
    //    copyDBFromResource();

    }


}



//}
