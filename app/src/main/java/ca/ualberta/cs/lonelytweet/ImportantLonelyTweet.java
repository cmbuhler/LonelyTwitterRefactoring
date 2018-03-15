package ca.ualberta.cs.lonelytweet;


import android.util.Log;

import java.util.Date;

/**
 * Created by Chase on 3/14/2018.
 */

public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet(){

    }

    public ImportantLonelyTweet(String text){
        this.tweetDate = new Date();
        this.tweetBody = text;
    }

    @Override
    public boolean isValid() {
        //Removed redundant if statement
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10);
    }

    @Override
    public String toString() {
        String string = getTweetDate() + " | " + getTweetBody();
        Log.i("importantTweet", string);
        return string;
    }


    public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}
