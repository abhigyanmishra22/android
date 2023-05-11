package com.example.loginpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private static final String dbname="signup_Student";
    private static final String signup_table="signupStudent";
    private static final String ID="student_id";
    private static final String Name="Student_name";

    public MyDatabaseHelper(Context context) {

        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS " + signup_table
                + "(" + ID + " INTEGER PRIMARY KEY, " + Name + " TEXT " +")");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS " + signup_table);
        onCreate(sqLiteDatabase);
    }

    public void add_data(String id, String name)
    {
        SQLiteDatabase database=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(ID,id);
        cv.put(Name,name);
        database.insert(signup_table,null, cv);}


    public ArrayList<LoginRecord> fetchRecord(){
        SQLiteDatabase database=this.getWritableDatabase();
        Cursor cursor= database.rawQuery(" SELECT * FROM " + signup_table, null);
        ArrayList<LoginRecord> lr= new ArrayList<>();
        while (cursor.moveToNext())
        {
            LoginRecord loginRecord=new LoginRecord();
            loginRecord.id= cursor.getInt(0);
            loginRecord.name= cursor.getString(1);
            lr.add(loginRecord);
        }
        return lr;
    }

    public void updateRecord(LoginRecord loginRecord)
    {
        SQLiteDatabase database=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        //changing name
        cv.put(Name,loginRecord.name);
        database.update(signup_table, cv, ID + "=" + loginRecord.id, null);
    }

    public void deleteRecord(int id)
    {
        SQLiteDatabase database=this.getWritableDatabase();
        database.delete(signup_table,ID+ "=?",new String[]{String.valueOf(id)});
    }
}
