package com.dumer.observer;

/**
 * Created by rakesh.barik on 13-03-2016.
 */
public class MyTopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+" No message");
        }else{
            System.out.println(name+"::consuming message::"+msg);
        }

    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
