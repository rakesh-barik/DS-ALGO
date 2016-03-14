package com.dumer.observer;

/**
 * Created by rakesh.barik on 13-03-2016.
 */
public class ObserverPatternTest {
    public static void main(String arg[]){
        MyTopic myTopic = new MyTopic();

        //create observer
        Observer observer1 = new MyTopicSubscriber("obj1");
        Observer observer2 = new MyTopicSubscriber("obj2");
        Observer observer3 = new MyTopicSubscriber("obj3");

        myTopic.register(observer1);
        myTopic.register(observer2);
        myTopic.register(observer3);

        //attach observer to subject
        observer1.setSubject(myTopic);
        observer2.setSubject(myTopic);
        observer3.setSubject(myTopic);

        observer1.update();
        //now send message to subject
        myTopic.postMessage("New Message");

    }
}
