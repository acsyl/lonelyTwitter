package ca.ualberta.cs.lonelytwitter;

/**
 * Created by ACsy on 2017-09-12.
 */

public class NormalTweet extends Tweet implements Tweetable{
    public NormalTweet(String message){
        super(message);

    }
    public Boolean isImportant(){
        return Boolean.False;
    }
}
