package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tommy3 on 9/15/16.
 */
public abstract class Mood {

    private Date date;

    public Mood() {
        date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String format();
}