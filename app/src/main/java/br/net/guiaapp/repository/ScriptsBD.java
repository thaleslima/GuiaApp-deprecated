package br.net.guiaapp.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by thaleslima on 09/03/14.
 */
public class ScriptsBD {
    public static final String[] SCRIPT_DATABASE_TABLES = new String[] {
            "create table city (id integer, description text, uf text, lastUpdate date);",
            "create table local (id integer, name text, telephone text, site text, email text, " +
                    "description text, address text, latitude text, longitude text, pathImage text, date text,  idMenu int , idCity int, rating real);",
            "create table comment (id integer, rating real, description text, date text, idUser integer, nameUser text);",
            "create table user (id integer, email text, password text, name text, lastName text);"
    };

    public static final String[] SCRIPT_DATABASE_DROP = new String[]{
            "DROP table IF EXISTS city",
            "DROP table IF EXISTS local",
            "DROP table IF EXISTS comment",
            "DROP table IF EXISTS user"
    };

    public ScriptsBD(Context ctx)
    {
        SQLiteHelper dbHelper = new SQLiteHelper(ctx);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        if(db != null)
            db.close();
    }
}
