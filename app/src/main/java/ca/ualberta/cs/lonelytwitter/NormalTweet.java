/*
 * Class Name: NormalTweet
 *
 * Version:Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team x,CMPUT301.University of Alberta.All Rights Reserved.You may use,distribute, or modify this code under terms and conditions of the code of Student Behavior of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class NormalTweet extends Tweet implements Tweetable{
    public NormalTweet(String message){
        super(message);
    }
    public NormalTweet(String message,Date date){
        super(message,date);
    }
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
