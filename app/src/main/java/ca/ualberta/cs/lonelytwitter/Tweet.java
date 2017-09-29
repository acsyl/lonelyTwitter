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

/*
* Represent a Tweet
*
*  @author
*  @version 1.0
*  @see NormalTweet
*  @see ImportantTweet
*  @since 1.0
* */

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
    /*
    * constructs Tweet objects
    *
    * @param message tweet message
    * @param date tweet date
    * */


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

        /*
    * set Tweet message
    *
    * @param message tweet message
    * @throws TweetTooLongException
    * */


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
