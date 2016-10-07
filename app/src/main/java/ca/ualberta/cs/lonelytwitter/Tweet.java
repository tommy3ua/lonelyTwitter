package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *  The abstract Tweet class that must be implemented. Contains a message and a date.
 *  @author Tommy
 *  @since 1.4
 *  @see Tweetable
 *  @see NormalTweet
 *  @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

    /**
     * Distinguishes between NormalTweet and ImportantTweet
     * @return Boolean
     * @see NormalTweet
     * @see ImportantTweet
     */
    public abstract Boolean isImportant();

    /**
     *
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
