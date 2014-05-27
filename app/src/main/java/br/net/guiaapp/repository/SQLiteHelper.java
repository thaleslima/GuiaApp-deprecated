package br.net.guiaapp.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by thaleslima on 09/03/14.
 */
public class SQLiteHelper extends SQLiteOpenHelper {
    private String TAG = "Bus Brazil";
    private static String DATABASE_NAME = "GuiaAppDB";
    private static int DATABASE_VERSION = 1;

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG, "Creating bd");

        int qtdScripts = ScriptsBD.SCRIPT_DATABASE_TABLES.length;

        for (int i = 0; i < qtdScripts; i++) {
            String sql = ScriptsBD.SCRIPT_DATABASE_TABLES[i];
            db.execSQL(sql);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i(TAG, "Update bd");

        int qtdScripts = ScriptsBD.SCRIPT_DATABASE_DROP.length;

        for (int i = 0; i < qtdScripts; i++) {
            String sql = ScriptsBD.SCRIPT_DATABASE_DROP[i];
            db.execSQL(sql);
        }

        onCreate(db);
    }
}
