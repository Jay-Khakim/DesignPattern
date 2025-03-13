package DesignPattern.Behavioral.Iterator.iterators;

import java.util.List;

import DesignPattern.Behavioral.Iterator.profile.Profile;
import DesignPattern.Behavioral.Iterator.social_networks.Facebook;

import java.util.ArrayList;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String type;
    private String email;
    private int currentPostion = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email){
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad(){
        if(emails.size() == 0){
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for(String profile:profiles){
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext(){
        lazyLoad();
        return currentPostion < emails.size();
    }

    @Override
    public Profile getNext(){
        if(!hasNext()){
            return null;
        }

        String friendEmail = emails.get(currentPostion);
        Profile friendProfile = profiles.get(currentPostion);
        if(friendProfile == null){
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPostion, friendProfile);
        }
        currentPostion++;
        return friendProfile;
    }

    @Override
    public void reset(){
        currentPostion = 0;
    }

}
