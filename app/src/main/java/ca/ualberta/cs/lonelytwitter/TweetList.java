package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by tommy3 on 9/29/16.
 */
public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList() {

    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        if (hasTweet(tweet))
        {
            throw new IllegalArgumentException();
        }
        else
        {
            tweets.add(tweet);
        }
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public ArrayList<Tweet> getTweets() {
        ArrayList<Tweet> tempTweets = new ArrayList<Tweet>(tweets);
        ArrayList<Tweet> result = new ArrayList<Tweet>();
        Tweet earliest;
        while (!tempTweets.isEmpty()) {
            earliest = tempTweets.get(0);
            for (int i = 0; i < tempTweets.size(); i++) {
                if (earliest.getDate().after(tempTweets.get(i).getDate())) {
                    earliest = tempTweets.get(i);
                }
            }
            result.add(earliest);
            tempTweets.remove(earliest);
        }
        return result;
    }

    public int getCount() {
        return tweets.size();
    }
}
