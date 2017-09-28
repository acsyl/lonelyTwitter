/*
 * Class Name: ImportantTweet
 *
 * Version:Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team x,CMPUT301.University of Alberta.All Rights Reserved.You may use,distribute, or modify this code under terms and conditions of the code of Student Behavior of Alberta.
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by shuyang2 on 2017-09-12.
 */

public class ImportantTweet extends Tweet{
    public ImportantTweet(String message){
        super(message);
    }
    public ImportantTweet(String message,Date date){
        super(message,date);
    }
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}