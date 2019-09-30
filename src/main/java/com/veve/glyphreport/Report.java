package com.veve.glyphreport;


import java.sql.Timestamp;

public class Report {

    int id;
    Timestamp timestamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Report(int id, Timestamp timestamp) {
        this.id = id;
        this.timestamp = timestamp;
    }
}
