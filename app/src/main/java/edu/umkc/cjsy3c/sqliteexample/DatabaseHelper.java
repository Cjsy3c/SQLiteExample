package edu.umkc.cjsy3c.sqliteexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by Cody on 3/22/2016.
 */
public class DatabaseHelper extends SQLiteAssetHelper {

    /*public static final String tableName = "people";
    public static final String keyCol = "_id";
    public static final String nameColumn = "name";
    public static final String favoriteColumn = "favorite";
    */
    private static final String dbName = "test.db";

    private static final int dbVersion = 1;

    // create table tableName(id integer primary key autoincrement, name text not null, favorite int not null);
    /*private static final String newDB = "create table " +tableName
            + "(" + keyCol + " integer primary key autoincrement, "
            + nameColumn + " text not null, "
            + favoriteColumn + " int not null);";
            */

    public DatabaseHelper(Context context) {
        super(context, dbName, null, dbVersion);
    }

}
