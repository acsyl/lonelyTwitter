package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by shuyang2 on 2017-09-12.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    ArrayList<Mood> moodList = new ArrayList<Mood>();


    public Tweet(String message){
        this.message = message;
        date = new Date();
    }
    public Tweet(String message, Date date){
        this.message = message;
        this.date=date;
    }


    // abstract body


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() < 140){
            // Do something
            this.message=message;
        }
        else{
            throw new TweetTooLongException();

        }
    }
    public abstract Boolean isImportant();

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void addMood(Mood mood){
        moodList.add(mood);
    }

    public  void removeMood(Mood mood){
        moodList.remove(mood);
    }
}
