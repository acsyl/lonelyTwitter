package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by shuyang2 on 2017-09-12.
 */

public abstract class Tweet {
    private String message;
    private Date date;

    ArrayList<CurrentMood> moodList = new ArrayList<CurrentMood>();

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    // abstract body
    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            // Do something
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

    public void addMood(CurrentMood mood){
        moodList.add(mood);
    }

    public  void removeMood(CurrentMood mood){
        moodList.remove(mood);
    }
}
