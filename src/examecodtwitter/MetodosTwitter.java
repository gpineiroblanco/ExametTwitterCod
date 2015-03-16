/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examecodtwitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author gpineiroblanco
 */
public class MetodosTwitter {
    
    ConfigurationBuilder cb = new ConfigurationBuilder();
    Twitter twitter;
    
     /**
     * Constructor, da acceso a nuestra cuenta en twitter.
     */
    public MetodosTwitter() {

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("kVeUkuBbS7E4m2BzzqKTCa00t")
                .setOAuthConsumerSecret("znSSjhVZhkjBBsNy9C7YSgclTO14eFFz0FXYBlCGxb0bKn3hXC")
                .setOAuthAccessToken("180784730-3sKIMf2JHiL0DnzDoGQ0Lzn2ES4xFo5bTOTIrVtv")
                .setOAuthAccessTokenSecret("kTXQAcbRbzBPi6pjttzgxEU9AhH6USs5uaX8qm1JxuD6S");
        twitter = new TwitterFactory(cb.build()).getInstance();
    }

    /**
     * Nos da nuestro timeLine
     */
}
