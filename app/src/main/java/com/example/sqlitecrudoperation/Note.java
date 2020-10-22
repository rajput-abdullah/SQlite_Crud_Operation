package com.example.sqlitecrudoperation;

public class Note  {

public static final String TABLE_NAME = "notes";
public static final String COLUMN_ID = "id" ;
public static final String COLUMN_NOTE = "note";
public static final String COLUMN_TIMESTAMP = "timestamp";
private int id;
private String note;
private String timestamp;

public static  final String CREATE_TABLE =
        "CREATE TABLE " + TABLE_NAME + "("
        + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
        + COLUMN_NOTE + " TEXT,"
        + COLUMN_TIMESTAMP + " DATETIME DEFAULT CURRENT_TIMESTAMP"
        + ")";
    public Note(int id, String note, String timestamp){
        this.id = id;
        this.note = note;
        this.timestamp = timestamp;
    }
    public Note(){
        this.id = id;
        this.note = note;
        this.timestamp = timestamp;
    }



    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getColumnId() {
        return COLUMN_ID;
    }

    public static String getColumnNote() {
        return COLUMN_NOTE;
    }

    public static String getColumnTimestamp() {
        return COLUMN_TIMESTAMP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public static String getCreateTable() {
        return CREATE_TABLE;
    }




}