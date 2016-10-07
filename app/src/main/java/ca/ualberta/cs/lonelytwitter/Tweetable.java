package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 *  Interface for objects that can be Tweeted.
 *  @author Tommy
 *  @since 1.4
 *  @see Tweet
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();

}
