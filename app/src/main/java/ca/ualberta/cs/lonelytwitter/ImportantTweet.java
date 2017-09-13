package ca.ualberta.cs.lonelytwitter;

/**
 * Created by shuyang2 on 2017-09-12.
 */

public class ImportantTweet extends Tweet{
    public ImportantTweet(String message){
        super(message);
    }
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}