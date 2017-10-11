package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by ACsy on 2017-10-10.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }

    public void testAddTweet() {
        Tweetlist tweets = new Tweetlist();
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        assertTrue(tweets.hasTweet(myTweet));

    }

    public void testDeleteTweet() {
        Tweetlist tweets = new Tweetlist();
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        tweets.deleteTweet(myTweet);
        assertFalse(tweets.hasTweet(myTweet));

    }

    public void testHasTweet() {
        Tweetlist tweets = new Tweetlist();
        Tweet myTweet = new NormalTweet("my tweet");
        assertFalse(tweets.hasTweet(myTweet));
        tweets.addTweet(myTweet);
        assertTrue(tweets.hasTweet(myTweet));

    }
    public void testGetTweet(){
        //getTweet method will take an index and will return the tweet at that index.
        Tweetlist tweets = new Tweetlist();
        NormalTweet  myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(),myTweet.getMessage());
        assertEquals(returnedTweet.getDate(), myTweet.getDate());


    }
}
