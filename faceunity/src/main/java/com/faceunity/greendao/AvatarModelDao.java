package com.faceunity.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.faceunity.entity.AvatarModel;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "AVATAR_MODEL".
 */
public class AvatarModelDao extends AbstractDao<AvatarModel, Long> {

    public static final String TABLENAME = "AVATAR_MODEL";

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"AVATAR_MODEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"ICON_PATH\" TEXT," + // 1: iconPath
                "\"CONFIG_JSON\" TEXT," + // 2: configJson
                "\"UI_JSON\" TEXT);"); // 3: uiJson
    }


    public AvatarModelDao(DaoConfig config) {
        super(config);
    }

    public AvatarModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"AVATAR_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AvatarModel entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String iconPath = entity.getIconPath();
        if (iconPath != null) {
            stmt.bindString(2, iconPath);
        }

        String configJson = entity.getConfigJson();
        if (configJson != null) {
            stmt.bindString(3, configJson);
        }

        String uiJson = entity.getUiJson();
        if (uiJson != null) {
            stmt.bindString(4, uiJson);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AvatarModel entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String iconPath = entity.getIconPath();
        if (iconPath != null) {
            stmt.bindString(2, iconPath);
        }

        String configJson = entity.getConfigJson();
        if (configJson != null) {
            stmt.bindString(3, configJson);
        }

        String uiJson = entity.getUiJson();
        if (uiJson != null) {
            stmt.bindString(4, uiJson);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    @Override
    public AvatarModel readEntity(Cursor cursor, int offset) {
        AvatarModel entity = new AvatarModel( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // iconPath
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // configJson
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // uiJson
        );
        return entity;
    }

    @Override
    public void readEntity(Cursor cursor, AvatarModel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIconPath(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setConfigJson(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUiJson(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
    }

    @Override
    protected final Long updateKeyAfterInsert(AvatarModel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /**
     * Properties of entity AvatarModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property IconPath = new Property(1, String.class, "iconPath", false, "ICON_PATH");
        public final static Property ConfigJson = new Property(2, String.class, "configJson", false, "CONFIG_JSON");
        public final static Property UiJson = new Property(3, String.class, "uiJson", false, "UI_JSON");
    }

    @Override
    public Long getKey(AvatarModel entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(AvatarModel entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
