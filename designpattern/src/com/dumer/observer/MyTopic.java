package com.dumer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakesh.barik on 13-03-2016.
 */
public class MyTopic implements Subject {
    List<Observer> observerList;
    String message;
    private boolean changed;
    public MyTopic() {
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer obs) {
        if(!observerList.contains(obs))observerList.add(obs);
    }

    @Override
    public void unregister(Observer obs) {
        if(observerList.contains(obs))observerList.remove(obs);
    }

    @Override
    public void notifyObserves() {
        observerList.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String message){
        System.out.println("Message Posted to Topic:"+message);
        this.message = message;
        this.changed = true;
        notifyObserves();
    }
}
