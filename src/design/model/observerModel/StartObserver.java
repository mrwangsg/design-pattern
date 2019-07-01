package design.model.observerModel;

/**
 * @创建人 sgwang
 * @name StartObserver
 * @user 91119
 * @创建时间 2019/6/28
 * @描述
 */
public class StartObserver {

    public static void main(String[] args) {
        /*
        1. 观察者 只有加入某主题 当主题变化时 才能通知观察者更新
        2. 主题只有发生改变时 通知观察者 才会有更新的操作
         */
        // 主题只有在有变化的时候 通知 观察者才会进行下一步
        MySubject mySubject = new MySubject();

        MyObserver myObserver01 = new MyObserver();
        MyObserver myObserver02 = new MyObserver();
        mySubject.addObserver(myObserver01);
        mySubject.addObserver(myObserver02);

        mySubject.setSubscribe("doing");
        mySubject.notifyObservers();

        mySubject.setSubscribe("done");
        mySubject.notifyObservers("done");
    }
}
