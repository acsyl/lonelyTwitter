/*
 * Class Name: Tweet
 *
 * Version:Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team x,CMPUT301.University of Alberta.All Rights Reserved.You may use,distribute, or modify this code under terms and conditions of the code of Student Behavior of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;



public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;



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
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }


    public String getMessage() {
        return message;
    }


    public Date getDate() {
        return date;
    }

}
