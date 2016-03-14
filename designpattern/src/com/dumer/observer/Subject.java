package com.dumer.observer;

/**
 * Created by rakesh.barik on 13-03-2016.
 */
public interface Subject {
    void register(Observer obs);
    void unregister(Observer obs);
    void notifyObserves();
    Object getUpdate(Observer obj);
}
