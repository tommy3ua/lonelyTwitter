package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by tommy3 on 9/15/16.
 */
public abstract class Tweet
{
    private String message;
    private Date date;

    private ArrayList<Mood> moods;

    public Tweet (String message)
    {
        this.message = message;
        this.date = new Date();
        moods = new ArrayList<Mood>();
    }

    public Tweet(String message, Date date)
    {
        this.message = message;
        this.date = date;
        moods = new ArrayList<Mood>();
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140)
        {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Mood> getMoods() {
        return moods;
    }

    public void setMoods(ArrayList<Mood> moods) {
        this.moods = moods;
    }

    @Override
    public String toString(){
        return message;
    }

    public abstract Boolean isImportant();
}
