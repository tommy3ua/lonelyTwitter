package ca.ualberta.cs.lonelytwitter;

/**
 * Created by tommy3 on 9/15/16.
 */
public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
