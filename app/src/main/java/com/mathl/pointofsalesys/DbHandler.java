package com.mathl.pointofsalesys;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Neal on 8/13/2016.
 */
public class DbHandler extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION =1;
    private static final String DATABABSE_NAME = "pointOfSale";
    private static final String EMPLOYEE_TABLE = "employees";
    private static final String KEY_ID = "id";
    private static final String KEY_FIRSTNAME = "firstName";
    private static final String KEY_LASTNAME = "lastName";
    private static final String KEY_ADDRESS = "address";
    private static final String KEY_PHONENUMBER = "phoneNumber";
    private static final String KEY_SSN = "ssn";
    private static final String KEY_PIN = "pin";
    private static final String KEY_DATECREATED = "dateCreated";

    public DbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
