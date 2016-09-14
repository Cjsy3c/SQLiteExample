package edu.umkc.cjsy3c.sqliteexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by Cody on 3/22/2016.
 */
public class Database {
    private SQLiteDatabase database;
    private DatabaseHelper dbHelper;
    // columns of the database
    //private static final String[] columns = {DatabaseHelper.keyCol,
    //        DatabaseHelper.nameColumn, DatabaseHelper.favoriteColumn};

    public Database(Context context){
        dbHelper = new DatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
    }

    public void close(){
        database.close();
        dbHelper.close();
    }

    public void addName(String name){
        // adds a new name to the database
        //ContentValues values = new ContentValues();
        //values.put(DatabaseHelper.nameColumn, name);
        //values.put(DatabaseHelper.favoriteColumn, 0);
        //database.insert(DatabaseHelper.tableName, null, values);
    }

    /*public ArrayList<String> listNames(){
        // lists the names from the database
        ArrayList<String> arr = new ArrayList<String>();
        // query the db for names
        Cursor cursor = database.query(DatabaseHelper.tableName, columns, null, null, null, null, null);
        cursor.moveToFirst();
        // get data from cursor
        do {
            boolean fav = (cursor.getInt(2) > 0);
            arr.add(cursor.getInt(0) + "     " +cursor.getString(1) + "     "+ fav );
        } while(cursor.moveToNext());

        cursor.close();
        return arr;
    }

    public void favorite(int id){
        // this should set the favorite column true for the certain id
        ContentValues value = new ContentValues();
        value.put(DatabaseHelper.favoriteColumn, 1);
        String where = "Where "+DatabaseHelper.keyCol + " = " + id;
        database.update(DatabaseHelper.tableName,value,where,null);
    }
*/

    public Cursor getData(){
        return database.query("PEOPLE",null, null, null, null, null, null);

    }

}
