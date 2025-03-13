package DesignPattern.Behavioral.Iterator.iterators;

import DesignPattern.Behavioral.Iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
