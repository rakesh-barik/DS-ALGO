package com.dumer.observer;

/**
 * Created by rakesh.barik on 13-03-2016.
 */
public interface Observer {
    void update();
    void setSubject(Subject sub);
}
