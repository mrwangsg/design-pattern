package design.model.observerModel;

import java.util.Observable;

/**
 * @创建人 sgwang
 * @name MySubject
 * @user 91119
 * @创建时间 2019/6/28
 * @描述
 */
public class MySubject extends Observable {
    private String subscribe = "waitting";

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {

        if (!this.subscribe.equals(subscribe)){
            this.setChanged();
        }

        this.subscribe = subscribe;
    }
}
