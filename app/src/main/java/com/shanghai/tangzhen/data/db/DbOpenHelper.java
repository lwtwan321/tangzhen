package com.shanghai.tangzhen.data.db;

import android.content.Context;

import com.shanghai.tangzhen.data.db.model.DaoMaster;
import com.shanghai.tangzhen.di.ApplicationContext;
import com.shanghai.tangzhen.di.DatabaseInfo;
import com.shanghai.tangzhen.utils.AppLogger;

import org.greenrobot.greendao.database.Database;

import javax.inject.Inject;

public class DbOpenHelper extends DaoMaster.OpenHelper {
    @Inject
    public DbOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        AppLogger.d("DEBUG", "DB_OLD_VERSION : " + oldVersion + ", DB_NEW_VERSION : " + newVersion);
        switch (oldVersion) {
            case 1:
            case 2:
                //db.execSQL("ALTER TABLE " + UserDao.TABLENAME + " ADD COLUMN "
                // + UserDao.Properties.Name.columnName + " TEXT DEFAULT 'DEFAULT_VAL'");
        }
    }
}
