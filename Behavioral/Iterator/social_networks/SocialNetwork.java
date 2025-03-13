package DesignPattern.Behavioral.Iterator.social_networks;

import DesignPattern.Behavioral.Iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);

}
