package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by ACsy on 2017-10-10.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }

    public void testAddTweet(){
        Tweetlist tweets = new Tweetlist();
        NormalTweet tweet = new NormalTweet("Test Tweet");

        try {
            tweets.addTweet(tweet);
        } catch (IllegalArgumentException e){
            assertTrue(true);
        }
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

    public void testGetCount() {
        Tweetlist tweets = new Tweetlist();
        assertEquals(tweets.getCount(), 0);
        NormalTweet tweet = new NormalTweet("Another Test Tweet");

        tweets.addTweet(tweet);
        assertEquals(tweets.getCount(), 1);

        tweets.deleteTweet(tweet);
        assertEquals(tweets.getCount(), 0);
    }
}
}
