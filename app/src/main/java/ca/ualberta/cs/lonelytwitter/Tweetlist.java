package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by ACsy on 2017-10-10.
 */

public class Tweetlist {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
//    add tweet to a list of tweets
    public void addTweet(Tweet tweet){
        tweets.add(tweet);


    }
//    delete tweet to a list of tweets
    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);

    }
//    if it ,return True
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);

    }
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
}
