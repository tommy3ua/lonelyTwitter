package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * List of Tweets to be displayed in a view.
 * @author Tommy
 * @since 1.4
 * @see Tweet
 * @see LonelyTwitterActivity
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
