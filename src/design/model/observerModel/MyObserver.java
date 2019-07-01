package design.model.observerModel;

import java.util.Observable;
import java.util.Observer;

/**
 * @创建人 sgwang
 * @name ConcreteObserver
 * @user 91119
 * @创建时间 2019/6/28
 * @描述
 */
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String temp = "主题变化 正在通知我！";

        if (o != null)
            temp += "    Observable: " + o.toString();

        if (arg != null)
            temp += "  arg: " + arg.toString();


        System.out.println(temp);
    }
}
