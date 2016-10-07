package ca.ualberta.cs.lonelytwitter;

/**
 *  The standard implementation of Tweet.
 *  @author Tommy
 *  @since 1.4
 *  @see Tweet
 */
public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Returns false to distinguish it from an ImportantTweet.
     * @return Boolean
     * @see ImportantTweet
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
