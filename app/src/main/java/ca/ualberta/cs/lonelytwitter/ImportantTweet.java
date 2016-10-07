package ca.ualberta.cs.lonelytwitter;

/**
 * An implementation of Tweet to be used for important tweets,
 * @author Tommy
 * @since 1.4
 * @see Tweet
 */
public class ImportantTweet extends Tweet{

    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Returns true to distinguish it from a NormalTweet.
     * @return Boolean
     * @see NormalTweet
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }


}
