package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by tommy3 on 9/29/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    // return true if TweetList already has a given tweet
    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testDelete() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    // successfully add a tweet, but throw exception if it is added again
    public void testAddDuplicateTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        try {
            tweets.add(tweet);
            assertTrue(Boolean.TRUE);
        }
        catch (IllegalArgumentException e) {
            assertTrue(Boolean.FALSE);
        }
        try {
            tweets.add(tweet);
            assertTrue(Boolean.FALSE);
        }
        catch (IllegalArgumentException e) {
            assertTrue(Boolean.TRUE);
        }
    }

    // return tweets in chronological order
    public void testGetTweetsChronological() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test1");
        tweet.setDate(new Date(123));
        Tweet tweet2 = new NormalTweet("test2");
        tweet2.setDate(new Date(4624));
        Tweet tweet3 = new NormalTweet("test3");
        tweet3.setDate(new Date(5));
        tweets.add(tweet);
        tweets.add(tweet2);
        tweets.add(tweet3);
        ArrayList<Tweet> orderedTweets = tweets.getTweets();
        Tweet prev = orderedTweets.get(0);
        for (int i = 1; i < orderedTweets.size(); i++) {
            assertTrue((orderedTweets.get(i).getDate().after(prev.getDate())) ||
                    (orderedTweets.get(i).getDate().equals(prev.getDate())));
        }
    }

    // get number of tweets (3)
    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test1");
        Tweet tweet2 = new NormalTweet("test2");
        Tweet tweet3 = new NormalTweet("test3");
        tweets.add(tweet);
        tweets.add(tweet2);
        tweets.add(tweet3);
        assertTrue(tweets.getCount() == 3);
    }
}
